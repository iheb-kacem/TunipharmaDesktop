package com.tunipharma.gui;

import com.tunipharma.dao.PharmacieDAO;
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
/**
 *
 * Demonstrates the usage of {@link JMapViewer}
 *
 * @author Jan Peter Stotz
 *
 */
public class MapClientFinal extends JPanel {

    private JMapViewerTree treeMap = null;

    /**
     * Constructs the {@code Demo}.
     */
    public MapClientFinal() {
        treeMap = new JMapViewerTree("Zones");
        setLayout(new BorderLayout());
        add(treeMap, BorderLayout.CENTER);
        map().setZoom(6);
        map().setCenter(new Point(8657, 6527));
        setMinimumSize(
                new java.awt.Dimension(519, 542));

    }

    private JMapViewer map() {
        return treeMap.getViewer();
    }

    public void addMapMarkerDot(Localisation l, String type) {
        MapMarkerDot mapMarkerDot = new MapMarkerDot(l.getLat(), l.getLon());
        if (type.equals("en garde")) {
            mapMarkerDot.setBackColor(Color.GREEN);
        } else if (type.equals("Pharmacie de Jour")) {
            mapMarkerDot.setBackColor(Color.yellow);
        } else {
            mapMarkerDot.setBackColor(Color.blue);
        }
        map().addMapMarker(mapMarkerDot);
    }


}
