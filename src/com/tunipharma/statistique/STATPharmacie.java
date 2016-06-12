package com.tunipharma.statistique;

/**
 *
 * @author asma 
 */
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.TreeSet;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import org.jfree.chart.*;
import org.jfree.chart.plot.*;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.data.time.Day;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;
import org.jfree.data.time.Hour;
import org.jfree.data.time.Month;

public class STATPharmacie extends JFrame {

    NumberAxis rangeAxis;
    ChartPanel chartPanel;
    JFreeChart chart;
    ArrayList<idef> ht;
    TimeSeries series_ligne_2 = null;
    JComboBox com;
    TimeSeriesCollection dataSet;

    public STATPharmacie() throws ClassNotFoundException, SQLException {
        try {
            ht = StatMapDAO.getInstance().pharmaIdAddressAll();
            this.setSize(900, 600);
            this.setTitle("statistique");
            JPanel p = new JPanel();

            // Couleurs des lignes
           
            Color COULEURLIGNE2 = Color.red;
          

            // On déclare le dataset
            dataSet = new TimeSeriesCollection();

            // Creation des lignes

            series_ligne_2 = new TimeSeries("courbe de note", Month.class);

            // Ajout des ligne dans le dataset

           dataSet.addSeries(series_ligne_2);
            

            // Creation du graphique
            chart = ChartFactory.createTimeSeriesChart("First TimeSeriesChart", "temps", "note", dataSet, true, true, false);
            chartPanel = new ChartPanel(chart, true);
            // Les dimmensions du graphique
            Dimension d = new Dimension(350, 250);
            chartPanel.setMaximumSize(d);
            chartPanel.setPreferredSize(d);
            chartPanel.setMinimumSize(d);
            this.add(chartPanel);
           //declaration et remplissage du combo box qui contien la liste des pharmacie

            Vector v = new Vector();
           




            for (idef i : ht) {
                String str = i.getAddress();
                v.add(str);


            }
          
            com = new JComboBox(v);

            chartPanel.add(new JLabel("Statistique des pharmacie"));
            chartPanel.add(com);
          

            com.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    try {
                        //try {
                        allActionPerformed(evt);
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(STATPharmacie.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (SQLException ex) {
                        Logger.getLogger(STATPharmacie.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    //} 
                    // catch (IOException ex) {
                    Logger.getLogger(STATPharmacie.class.getName()).log(Level.OFF, "cv");
                    // }
                }

                private void allActionPerformed(ActionEvent evt) throws ClassNotFoundException, SQLException {

                    System.out.println("mchetchi");
                    dataSet.removeAllSeries();
                     series_ligne_2=createTS(com.getSelectedItem().toString());
                    

             
                    dataSet.addSeries(series_ligne_2);
                   

                    chart = ChartFactory.createTimeSeriesChart("First TimeSeriesChart", "temps", "note", dataSet, true, true, false);



                }
            });

            /**
             * *************
             */
            XYPlot plot = (XYPlot) chart.getPlot();
            // On definie une couleur pour les lignes

            plot.getRenderer().setSeriesPaint(1, COULEURLIGNE2);
          
            // On definie une couleur de fond pour le graphique
            plot.setBackgroundPaint(Color.WHITE);
            rangeAxis = (NumberAxis) plot.getRangeAxis();
            // On fixe une taille pour l'axe des ordonnÃ©es
            rangeAxis.setUpperBound(5.0);
           

           
            
            this.setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(STATPharmacie.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//constructeur end
    

    private TimeSeries createTS(String adrs) throws ClassNotFoundException, SQLException {
        
        TimeSeries tm=new TimeSeries("courbe des note",Month.class);
        ArrayList<Integer> janvier =new ArrayList<Integer>();     ArrayList<Integer> juillet=new ArrayList<Integer>();
        ArrayList<Integer> fevrier=new ArrayList<Integer>();      ArrayList<Integer> aout=new ArrayList<Integer>();
        ArrayList<Integer> mars=new ArrayList<Integer>();         ArrayList<Integer> septembre=new ArrayList<Integer>();
        ArrayList<Integer> avril=new ArrayList<Integer>();        ArrayList<Integer> octobre=new ArrayList<Integer>();
        ArrayList<Integer> mai=new ArrayList<Integer>();          ArrayList<Integer> novembre=new ArrayList<Integer>();
        ArrayList<Integer> juin=new ArrayList<Integer>();          ArrayList <Integer>decembre=new ArrayList<Integer>();
        int x;
        Date d;
        
        float janvier1=0;float fevrier1=0; float mars1=0;float avril1=0;
         float mai1=0;float juin1=0;float juillet1=0;float aout1=0;
         float septembre1=0;float octobre1=0;float novembre1=0;float decembre1=0;

        for (idef i : ht) {
            if (adrs.equals(i.getAddress())) {
                x = i.getId();
                
                ResultSet rs = StatMapDAO.getInstance().phnoter(x);

                while (rs.next()) {
                    
                    rs.getInt("pharmacie");
                    d = rs.getDate("jour");
                   int nx= rs.getInt("evaluation");
                    
                    switch(d.getMonth()+1){     
                        case 1:{janvier.add(nx);};break;
                        case 2:{fevrier.add(nx);};break;
                        case 3:{mars.add(nx);};break;
                        case 4:{avril.add(nx);};break;
                        case 5:{mai.add(nx);};break;
                        case 6:{juin.add(nx);};break;
                        case 7:{juillet.add(nx);};break;
                        case 8:{aout.add(nx);};break;
                        case 9:{septembre.add(nx);};break;
                        case 10:{octobre.add(nx);};break;
                        case 11:{novembre.add(nx);};break;
                        case 12:{decembre.add(nx);};break;
             }//switchEND
                        

           }//whileEND
                for(int aa:janvier){
                    janvier1+=aa;
                }
                for(int aa:fevrier){
                    fevrier1+=aa;
                }
                for(int aa:mars){
                    mars1+=aa;
                }
                for(int aa:avril){
                    avril1+=aa;
                }
                for(int aa:mai){
                    mai1+=aa;
                }
                for(int aa:juin){
                    juin1+=aa;
                }
                for(int aa:juillet){
                    juillet1+=aa;
                }
                for(int aa:aout){
                    aout1+=aa;
                }
                for(int aa:septembre){
                    septembre1+=aa;
                }
                for(int aa:octobre){
                    octobre1+=aa;
                }
                for(int aa:novembre){
                    novembre1+=aa;
                }
                for(int aa:decembre){
                    decembre1+=aa;
                }
               
                tm.setNotify(false);
                tm.add(new Month(1,2012 ), calculnote(janvier1,janvier.size()));
                tm.add(new Month(2,2012 ),calculnote(fevrier1,fevrier.size()) );
                tm.add(new Month(3,2012 ),calculnote (mars1,mars.size()));
                tm.add(new Month(4,2012 ), calculnote(avril1,avril.size()));
                tm.add(new Month(5,2012 ), calculnote(mai1,mai.size()));
                tm.add(new Month(6,2012 ),calculnote (juin1,juin.size()));
                tm.add(new Month(7,2012 ),calculnote (juillet1,juillet.size()));
                tm.add(new Month(8,2012 ),calculnote( aout1,aout.size()));
                tm.add(new Month(9,2012 ),calculnote (septembre1,septembre.size()));
                tm.add(new Month(10,2012 ),calculnote (octobre1,octobre.size()));
                tm.add(new Month(11,2012 ),calculnote (novembre1,novembre.size()));
                tm.add(new Month(12,2012 ),calculnote( decembre1,decembre.size()));
                tm.setNotify(true);
                

             break;
        }//endIF
     }//endFor




        return tm;

    }//createstate END
    
    private float calculnote(float somme,int taille)
    {float z=0;
    if(taille==0)
    { z=0;}
    else
    {z=somme/taille;}
    return z;
    }

    public static void main(String args[]) {
        STATPharmacie xychart;
        try {
            xychart = new STATPharmacie();
            xychart.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            xychart.setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(STATPharmacie.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(STATPharmacie.class.getName()).log(Level.SEVERE, null, ex);
        }


    }
}
