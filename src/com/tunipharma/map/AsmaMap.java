package com.tunipharma.map;

import java.awt.Color;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.event.MouseInputListener;

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
import javax.swing.*;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;
import org.xml.sax.SAXException;

/**
 * 
 * @author Asma Daoud
 */
public class AsmaMap 
{
	/**
	 * @param args the program args (ignored)
	 */
     private static JComboBox combo;
     private static JXMapViewer mapViewer;
   
     
     
     
	public static void main(String[] args)
	{
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

		
                GeoPosition tunis = new GeoPosition(36.816019,10.167832);
                GeoPosition esprit = new GeoPosition(36.898524,10.189839);
               // GeoPosition dardoj = new GeoPosition
                

		// Set the focus
		mapViewer.setZoom(10);
		mapViewer.setAddressLocation(esprit);
	
		// Add interactions
		MouseInputListener mia = new PanMouseInputListener(mapViewer);
		mapViewer.addMouseListener(mia);
		mapViewer.addMouseMotionListener(mia);
		mapViewer.addMouseListener(new CenterMapListener(mapViewer));
		mapViewer.addMouseWheelListener(new ZoomMouseWheelListenerCenter(mapViewer));
		mapViewer.addKeyListener(new PanKeyListener(mapViewer));

		// Create waypoints from the geo-positions
		Set<MyWaypoint> waypoints = new HashSet<MyWaypoint>(Arrays.asList(
                                new MyWaypoint("T", Color.yellow, tunis),
                        new MyWaypoint("esprit", Color.blue, esprit))
                        
                        );

		// Create a waypoint painter that takes all the waypoints
		WaypointPainter<MyWaypoint> waypointPainter = new WaypointPainter<MyWaypoint>();
		waypointPainter.setWaypoints(waypoints);
		waypointPainter.setRenderer(new FancyWaypointRenderer());
		
		mapViewer.setOverlayPainter(waypointPainter);

		// Display the viewer in a JFrame
		JFrame frame = new JFrame("ASMA MAP");
                
		frame.getContentPane().add(mapViewer);
                mapViewer.setSize(500,500);
		frame.setSize(900, 600);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
                
                //nouvel essai
                JFrame lf= new JFrame("test map");
                JPanel p= new JPanel();
                //p.setSize(600  , 600);
                //p.add(mapViewer);
                JLabel label=new JLabel("");
                        label.setLocation(10, 10);
                mapViewer.add(label);
                mapViewer.add(new JLabel(""));
                combo= new JComboBox();
                //declatation des action
                combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
              //  ComboActionPerformed(evt);
            }
        });
                combo.addItem("tunis");
                combo.addItem("esprit");
                
                mapViewer.add(combo);
                
                JScrollPane js= new JScrollPane(mapViewer);
                js.setSize(500, 500);
                js.setLocation(500, 500);
                //lf.add(mapViewer);
                lf.add(js);
                lf.setSize(1000, 1000);
                lf.setVisible(true);
                //lf.add(frame);
		
           
	}

    
     private void ComboActionPerformed(java.awt.event.ActionEvent evt) {
        
        ArrayList position = new ArrayList();
        int x=0;int y=0;
        Geo g= new Geo();
        
                
                
                String st=combo.getSelectedItem().toString();
                System.out.println(st);
                
            try {
                position=g.location(st);
                x=(int)position.get(0);
                y=(int)position.get(1);
                
                GeoPosition geoPoint = new GeoPosition(x,y);
                //placemaker
                
                
               // mapViewer.
                mapViewer.setAddressLocation(geoPoint);
            } catch (IOException ex) {
                Logger.getLogger(AsmaMap.class.getName()).log(Level.SEVERE, null, ex);
            } catch (XPathExpressionException ex) {
                Logger.getLogger(AsmaMap.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ParserConfigurationException ex) {
                Logger.getLogger(AsmaMap.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SAXException ex) {
                Logger.getLogger(AsmaMap.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        
        
       
    }//actionEND

   
}//calss END
