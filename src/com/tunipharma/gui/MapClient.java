package com.tunipharma.gui;


import com.tunipharma.entities.Localisation;
import com.tunipharma.entities.Pharmacie;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;
import org.openstreetmap.gui.jmapviewer.JMapViewer;
import org.openstreetmap.gui.jmapviewer.JMapViewerTree;
import org.openstreetmap.gui.jmapviewer.MapMarkerDot;
import org.openstreetmap.gui.jmapviewer.events.JMVCommandEvent;
import org.openstreetmap.gui.jmapviewer.interfaces.JMapViewerEventListener;
import org.openstreetmap.gui.jmapviewer.interfaces.MapMarker;

/**
 *
 * Demonstrates the usage of {@link JMapViewer}
 *
 * @author Jan Peter Stotz
 *
 */
public class MapClient extends JPanel implements JMapViewerEventListener {

    private JMapViewerTree treeMap = null;
    List<Pharmacie> pharmacies;

    /**
     * Constructs the {@code Demo}.
     */
    public MapClient() {
        treeMap = new JMapViewerTree("Zones");
        pharmacies = new ArrayList<Pharmacie>();
        map().addJMVListener(this);
        setLayout(new BorderLayout());
        JPanel legende = new JPanel();
        
        add(legende, BorderLayout.SOUTH);
        add(treeMap, BorderLayout.CENTER);
        
        JLabel enGarde = new JLabel("En Garde");
        enGarde.setForeground(Color.GREEN);
        JLabel deJour = new JLabel("Pharmacie de Jour");
        deJour.setForeground(Color.yellow);
        JLabel deNuit = new JLabel("Pharmacie de Nuit");
        deNuit.setForeground(Color.blue);
        legende.add(enGarde);
        legende.add(deJour);
        legende.add(deNuit);
        map().setZoom(6);
        map().setCenter(new Point(8657, 6527));
        map().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 1 && e.getButton() == MouseEvent.BUTTON1 && map().getZoom() >= 14) {

                    Point p = e.getPoint();
                    int X = p.x;
                    int Y = p.y;
                    List<MapMarker> ar = map().getMapMarkerList();
                    Iterator<MapMarker> i = ar.iterator();
                    while (i.hasNext()) {

                        MapMarker mapMarker = (MapMarker) i.next();

                        Point MarkerPosition = map().getMapPosition(mapMarker.getLat(), mapMarker.getLon());
                        if (MarkerPosition != null) {

                            int centerX = MarkerPosition.x;
                            int centerY = MarkerPosition.y;

                            // calculate the radius from the touch to the center of the dot
                            double radCircle = Math.sqrt((((centerX - X) * (centerX - X)) + (centerY - Y) * (centerY - Y)));

                            // if the radius is smaller then 23 (radius of a ball is 5), then it must be on the dot
                            if (radCircle < 4) {
                                for (Pharmacie pharmacie : pharmacies) {
                                    if (pharmacie.getLocation().equals(new Localisation(mapMarker.getLat(), mapMarker.getLon()))) {
//                                        int id = pharmacie.getId();
//                                        try {
//                                            ClassMap map = new ClassMap(id);
//                                        } catch (ClassNotFoundException ex) {
//                                            Logger.getLogger(PharmacieListe.class.getName()).log(Level.SEVERE, null, ex);
//                                        } catch (SQLException ex) {
//                                            Logger.getLogger(PharmacieListe.class.getName()).log(Level.SEVERE, null, ex);
//                                        }
                                        new ConsulterPharmacieClient(pharmacie).setVisible(true);
                                        break;
                                    }
                                }

                            }

                        }
                    }
                }
            }
        }
        );

        setMinimumSize(new java.awt.Dimension(519, 542));

    }

    private JMapViewer map() {
        return treeMap.getViewer();
    }

    public void addMapMarkerDot(Pharmacie pharmacie, Localisation l, String type) {
        MapMarkerDot mapMarkerDot = new MapMarkerDot(l.getLat(), l.getLon());
        pharmacies.add(pharmacie);
        if (type.equals("en garde")) {
            mapMarkerDot.setBackColor(Color.GREEN);
        } else if (type.equals("Pharmacie de Jour")) {
            mapMarkerDot.setBackColor(Color.yellow);
        } else {
            mapMarkerDot.setBackColor(Color.blue);
        }
        map().addMapMarker(mapMarkerDot);
    }

    public void initMapMarkerDot() {
        map().removeAllMapMarkers();
        pharmacies = new ArrayList<Pharmacie>();
    }

    @Override
    public void processCommand(JMVCommandEvent jmvce) {
    }
}
