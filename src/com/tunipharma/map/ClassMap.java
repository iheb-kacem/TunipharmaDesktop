/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tunipharma.map;

import com.tunipharma.dao.PharmacieDAO;
import com.tunipharma.entities.Pharmacie;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.event.MouseInputListener;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;
import org.jdesktop.swingx.JXMapViewer;
import org.jdesktop.swingx.VirtualEarthTileFactoryInfo;
import org.jdesktop.swingx.input.CenterMapListener;
import org.jdesktop.swingx.input.PanKeyListener;
import org.jdesktop.swingx.input.PanMouseInputListener;
import org.jdesktop.swingx.input.ZoomMouseWheelListenerCenter;
import org.jdesktop.swingx.mapviewer.DefaultTileFactory;
import org.jdesktop.swingx.mapviewer.GeoPosition;
import org.jdesktop.swingx.mapviewer.LocalResponseCache;
import org.jdesktop.swingx.mapviewer.TileFactoryInfo;
import org.jdesktop.swingx.mapviewer.WaypointPainter;
import org.xml.sax.SAXException;
import javax.swing.*;

/**
 *
 * @author asus
 */
public class ClassMap implements ActionListener {

    private JComboBox combo;
    private JXMapViewer mapViewer;
    GeoPosition tunis;
    JCheckBox all;
    MyWaypoint centreVille;
    JFrame lf;
    private int id;
    ArrayList<idef> ht;

    public ClassMap(int id) throws ClassNotFoundException, SQLException {
        this.id = id;
        ht = StatMapDAO.getInstance().pharmaIdAddressAll();




        // Create a TileFactoryInfo for Virtual Earth

        TileFactoryInfo info = new VirtualEarthTileFactoryInfo(VirtualEarthTileFactoryInfo.MAP);
        DefaultTileFactory tileFactory = new DefaultTileFactory(info);
        tileFactory.setThreadPoolSize(8);

        // Setup local file cache
        File cacheDir = new File(System.getProperty("user.home") + File.separator + ".jxmapviewer2");
        LocalResponseCache.installResponseCache(info.getBaseURL(), cacheDir, false);
        

        // Setup JXMapViewer
        mapViewer = new JXMapViewer();
        
        mapViewer.setTileFactory(tileFactory);


        GeoPosition tunis = new GeoPosition(36.816019, 10.167832);
        GeoPosition esprit = new GeoPosition(36.898524, 10.189839);
        this.tunis = new GeoPosition(36.819897, 10.164564);
        // GeoPosition dardoj = new GeoPosition



        // Set the focus
        mapViewer.setZoom(10);
        mapViewer.setAddressLocation(this.tunis);



        // Create waypoints from the geo-positions
        centreVille = new MyWaypoint("centre ville", Color.blue, this.tunis);

        Set<MyWaypoint> waypoints = new HashSet<MyWaypoint>(Arrays.asList(
                new MyWaypoint("T", Color.yellow, tunis),
                new MyWaypoint("esprit", Color.blue, esprit)));

        waypoints.add(centreVille);

        // Create a waypoint painter that takes all the waypoints
        WaypointPainter<MyWaypoint> waypointPainter = new WaypointPainter<MyWaypoint>();
        waypointPainter.setWaypoints(waypoints);
        waypointPainter.setRenderer(new FancyWaypointRenderer());

        mapViewer.setOverlayPainter(waypointPainter);



        // Add interactions
        MouseInputListener mia = new PanMouseInputListener(mapViewer);
        mapViewer.addMouseListener(mia);
        mapViewer.addMouseMotionListener(mia);
        mapViewer.addMouseListener(new CenterMapListener(mapViewer));
        mapViewer.addMouseWheelListener(new ZoomMouseWheelListenerCenter(mapViewer));
        mapViewer.addKeyListener(new PanKeyListener(mapViewer));



        //nouvel essai*****************************************************
        lf = new JFrame("Geolocalisation des Pharmacie");
        lf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel p = new JPanel();
        //p.setSize(600  , 600);
        //p.add(mapViewer);
        JLabel label = new JLabel("afficher toute les pharmacie");
        label.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        label.setForeground(new java.awt.Color(255, 102, 153));
        //label.setLocation(10, 10);
        all = new JCheckBox();


        mapViewer.add(label);
        mapViewer.add(all);

        mapViewer.add(new JLabel("liste des pharmacie"));


     

        //declaration et remplissage du combo box qui contien la liste des pharmacie
        Vector v = new Vector();

        for (idef i : ht) {
            String str = i.getAddress();
            v.add(str);

        }
        combo = new JComboBox(v);




        mapViewer.add(combo);
       // JLabel description = new JLabel();

        //lf.add(description);
        //description.


        //mapViewer.add(description);

        combo.addActionListener((ActionListener) this);
        // all.addActionListener((ActionListener) this);

        all.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    allActionPerformed(evt);
                } catch (IOException ex) {
                    Logger.getLogger(ClassMap.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });



        lf.add(mapViewer);
        lf.isResizable();
        lf.setSize(1000, 1000);
        lf.setVisible(true);
        
        
        
        //ajout du point id @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
        try{
        for (idef i : ht) {
            if (i.getId() == this.id) {
                String adresse = i.getAddress();
                float x = Float.NaN;
                float y = Float.NaN;
                Geo g = new Geo();

                x = (float) g.location(adresse).get(0);
                y = (float) g.location(adresse).get(1);

                GeoPosition geoPoint = new GeoPosition(x, y);
                mapViewer.setZoom(5);
                
                //placemaker
                waypoints = new HashSet<MyWaypoint>(Arrays.asList(
                        new MyWaypoint("", Color.WHITE, geoPoint)));

                // Create a waypoint painter that takes all the waypoints
                 waypointPainter = new WaypointPainter<MyWaypoint>();
                waypointPainter.setWaypoints(waypoints);
                waypointPainter.setRenderer(new FancyWaypointRenderer());

                mapViewer.setOverlayPainter(waypointPainter);
                // mapViewer.
                mapViewer.setAddressLocation(geoPoint);
                
                //ajout du POP-UP
                PharmacieDAO pDAO = new PharmacieDAO();
                        Pharmacie ph = pDAO.findPhamacieById(id);
                        JDialog dialog = new JDialog(lf, "fiche pharmacie");
                        dialog.setSize(400, 300);

                        JPanel paneldedonne = new JPanel();
                        paneldedonne.setLayout(new javax.swing.BoxLayout(paneldedonne, javax.swing.BoxLayout.PAGE_AXIS));
                        
                        

                        if (ph.getType().equals("Pharmacie de Jour")) {
                            try {
                                Image img = ImageIO.read(getClass().getResource("/img/sun.png"));

                                paneldedonne.add(new JLabel(new ImageIcon(img)));
                            } catch (IOException ex) {
                                System.out.println("erreur image " + ex);
                            }

                        } else {
                            try {
                                Image img = ImageIO.read(getClass().getResource("/img/Moon.png"));

                                paneldedonne.add(new JLabel(new ImageIcon(img)));
                            } catch (IOException ex) {
                                System.out.println("erreur image" + ex);
                            }


                        }


                        paneldedonne.add(new JLabel("nom du propriétaire:" + ph.getName()));
                        paneldedonne.add(new JLabel("type:" + ph.getType()));
                        paneldedonne.add(new JLabel("telephone:" + ph.getNumTel()));
                        paneldedonne.add(new JLabel("e-mail:"+ ph.geteMail()));

                        dialog.setContentPane(paneldedonne);
                        dialog.show();

                break;
            }
        }
        }catch (IOException ex) {
                Logger.getLogger(AsmaMap.class.getName()).log(Level.SEVERE, null, ex);
            } catch (XPathExpressionException ex) {
                Logger.getLogger(AsmaMap.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ParserConfigurationException ex) {
                Logger.getLogger(AsmaMap.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SAXException ex) {
                Logger.getLogger(AsmaMap.class.getName()).log(Level.SEVERE, null, ex);
            }
        //@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
        

  
    }//constructeurEND**************************************************************

    //les action ################################################################
    //comboBoxAction
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        //ArrayList position = new ArrayList();
        float x = Float.NaN;
        float y = Float.NaN;
        Geo g = new Geo();


        if (source == combo) {
            String st = combo.getSelectedItem().toString();
            System.out.println("chaine de localisation" + st);

            try {

                //position=g.location(st);
                System.out.println("retour de GEO" + g.location(st));
                x = (float) g.location(st).get(0);
                y = (float) g.location(st).get(1);
                System.out.println("les position" + x + ":" + y);

                GeoPosition geoPoint = new GeoPosition(x, y);
                mapViewer.setZoom(5);

                //placemaker
                Set<MyWaypoint> waypoints = new HashSet<MyWaypoint>(Arrays.asList(
                        new MyWaypoint("", Color.WHITE, geoPoint)));

                // Create a waypoint painter that takes all the waypoints
                WaypointPainter<MyWaypoint> waypointPainter = new WaypointPainter<MyWaypoint>();
                waypointPainter.setWaypoints(waypoints);
                waypointPainter.setRenderer(new FancyWaypointRenderer());

                mapViewer.setOverlayPainter(waypointPainter);
                // mapViewer.
                mapViewer.setAddressLocation(geoPoint);

                for (idef i : ht) {
                    if (i.getAddress().equals(st)) {
                        int id = i.getId();
                        PharmacieDAO pDAO = new PharmacieDAO();
                        Pharmacie ph = pDAO.findPhamacieById(id);
                        JDialog dialog = new JDialog(lf, "fiche pharmacie");
                        dialog.setSize(400, 300);

                        JPanel paneldedonne = new JPanel();
                        paneldedonne.setLayout(new javax.swing.BoxLayout(paneldedonne, javax.swing.BoxLayout.PAGE_AXIS));

                        if (ph.getType().equals("Pharmacie de Jour")) {
                            try {
                                Image img = ImageIO.read(getClass().getResource("/img/sun.png"));

                                paneldedonne.add(new JLabel(new ImageIcon(img)));
                            } catch (IOException ex) {
                                System.out.println("erreur image " + ex);
                            }

                        } else {
                            try {
                                Image img = ImageIO.read(getClass().getResource("/img/Moon.png"));

                                paneldedonne.add(new JLabel(new ImageIcon(img)));
                            } catch (IOException ex) {
                                System.out.println("erreur image" + ex);
                            }


                        }


                        paneldedonne.add(new JLabel("nom du propriétaire:" + ph.getName()));
                        paneldedonne.add(new JLabel("type:" + ph.getType()));
                        paneldedonne.add(new JLabel("telephone:" + ph.getNumTel()));
                        paneldedonne.add(new JLabel("e-mail" + ph.geteMail()));

                        dialog.setContentPane(paneldedonne);
                        dialog.show();
                        break;

                    }


                }


            } catch (IOException ex) {
                Logger.getLogger(AsmaMap.class.getName()).log(Level.SEVERE, null, ex);
            } catch (XPathExpressionException ex) {
                Logger.getLogger(AsmaMap.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ParserConfigurationException ex) {
                Logger.getLogger(AsmaMap.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SAXException ex) {
                Logger.getLogger(AsmaMap.class.getName()).log(Level.SEVERE, null, ex);
            }



        }


    }//actionEND

    //l action du checkbox#########################################################################
    public void allActionPerformed(ActionEvent e) throws IOException {
        Object source = e.getSource();


        Set<MyWaypoint> waypoints = new HashSet<MyWaypoint>();


        if (source == all) {
            if (all.isSelected() == false) {
                //afficher une map vide
                mapViewer.setOverlayPainter(null);
            } else if (all.isSelected() == true) {
                try {
                    float x = Float.NaN;
                    float y = Float.NaN;
                    //recupere la liste des pharma et les affiche tt 

                    for (idef i : ht) {
                        Geo g = new Geo();
                        String str = i.getAddress();
                        System.out.println("le pays" + str);

                        System.out.println(g.location(str));
                        x = (float) g.location(str).get(0);
                        y = (float) g.location(str).get(1);

                        System.out.println("X:" + x + "Y=" + y);
                        GeoPosition geoPoint = new GeoPosition(x, y);
                        //ajouter un waypoint a la liste des waypoints 
                        waypoints.add(new MyWaypoint(str, Color.WHITE, geoPoint));


                    }//forend
                    mapViewer.setZoom(30);
                    // System.out.println("waypoint:"+waypoints);


                    // Create a waypoint painter that takes all the waypoints
                    WaypointPainter<MyWaypoint> waypointPainter = new WaypointPainter<MyWaypoint>();
                    waypointPainter.setWaypoints(waypoints);
                    waypointPainter.setRenderer(new FancyWaypointRenderer());
                    System.out.println(waypoints);

                    mapViewer.setOverlayPainter(waypointPainter);
                    // mapViewer.
            




                } catch (IOException ex) {
                    Logger.getLogger(AsmaMap.class.getName()).log(Level.SEVERE, null, ex);
                } catch (XPathExpressionException ex) {
                    Logger.getLogger(AsmaMap.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ParserConfigurationException ex) {
                    Logger.getLogger(AsmaMap.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SAXException ex) {
                    Logger.getLogger(AsmaMap.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }
    }//actionEND
}//ClassEND
