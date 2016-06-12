/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tunipharma.gui;

import com.tunipharma.dao.ServiceDAO;
import com.tunipharma.entities.Service;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Ferdawes
 */
public class Demade_ajout_service extends javax.swing.JFrame {
    Service service=new Service();

    ServiceDAO servicedao = new ServiceDAO();
    /**
     * Creates new form Demade_ajout_service
     */
    public Demade_ajout_service() {
        initComponents();
        initCategorie();
           this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    private void initCategorie() {
        ServiceDAO serviceDAO = new ServiceDAO();
        if (Combo_ajout_dem.getSelectedIndex() != -1) {
            Combo_ajout_dem.removeAllItems();
        }
        List<String> listec = serviceDAO.getAllCategories();
        for (String c : listec) {
            Combo_ajout_dem.addItem(c);
        }
      Combo_ajout_dem.addItem(new String("----------Other----------"));
        otherCategorie_dem.setVisible(false);
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Cate = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Combo_ajout_dem = new javax.swing.JComboBox();
        otherCategorie_dem = new javax.swing.JTextField();
        ajout_nom_servi_dem = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        desc_ajou_serv_dem = new javax.swing.JTextArea();
        but_ajouter_serv_dem = new javax.swing.JButton();
        but_annuler_serv_dem1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 0));
        jLabel1.setText("Demande d'ajout  du service");

        Cate.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Cate.setText("Catégorie :");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Nom de service :");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Description :");
        jLabel4.setToolTipText("");

        Combo_ajout_dem.setActionCommand("Categ_c_dem");
        Combo_ajout_dem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Combo_ajout_demActionPerformed(evt);
            }
        });

        otherCategorie_dem.setMaximumSize(new java.awt.Dimension(6, 20));

        desc_ajou_serv_dem.setColumns(20);
        desc_ajou_serv_dem.setRows(5);
        jScrollPane1.setViewportView(desc_ajou_serv_dem);

        but_ajouter_serv_dem.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        but_ajouter_serv_dem.setText("Ajouter");
        but_ajouter_serv_dem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_ajouter_serv_demActionPerformed(evt);
            }
        });

        but_annuler_serv_dem1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        but_annuler_serv_dem1.setText("Annuler");
        but_annuler_serv_dem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_annuler_serv_dem1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Cate)
                                .addGap(86, 86, 86)
                                .addComponent(Combo_ajout_dem, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(otherCategorie_dem, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(33, 33, 33)
                                .addComponent(ajout_nom_servi_dem, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(64, 64, 64)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(but_ajouter_serv_dem, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(26, 26, 26)))
                                .addGap(4, 4, 4)
                                .addComponent(but_annuler_serv_dem1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel1)
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cate)
                    .addComponent(Combo_ajout_dem, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(otherCategorie_dem, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ajout_nom_servi_dem, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(but_ajouter_serv_dem)
                    .addComponent(but_annuler_serv_dem1))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Combo_ajout_demActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Combo_ajout_demActionPerformed
        if (evt.getActionCommand() == "Categ_c_dem") {
            if ( Combo_ajout_dem.getSelectedItem() != null &&  Combo_ajout_dem.getSelectedItem().toString().equals("----------Other----------")) {
                otherCategorie_dem.setVisible(true);
                revalidate();
            } else {
                otherCategorie_dem.setVisible(false);
                revalidate();
            }
        }
    }//GEN-LAST:event_Combo_ajout_demActionPerformed

    private void but_ajouter_serv_demActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_ajouter_serv_demActionPerformed
        if (evt.getActionCommand().equals("Ajouter")) {
            final Service service = new Service();
             if( 1!=Combo_ajout_dem.getSelectedIndex()){
               JOptionPane.showMessageDialog(this, "Champs categorie vide");
           }
           else{
            if (Combo_ajout_dem.getSelectedItem().toString().equals("----------Other----------")) {
                service.setCategorie( otherCategorie_dem.getText());
            } else {
                service.setCategorie(Combo_ajout_dem.getSelectedItem().toString());
            }
            if(ajout_nom_servi_dem.getText().length()==0)
            {
            
           
            JOptionPane.showMessageDialog(this, "Champs nom vide");
            }
            else {
            service.setNom(ajout_nom_servi_dem.getText());
             }
                  if(desc_ajou_serv_dem.getText().length()==0)
            {
            
            
            JOptionPane.showMessageDialog(this, "Champs description vide");
            }
            else {
            service.setDescription(desc_ajou_serv_dem.getText());
            service.setEtat("demande");
             
           
           
           servicedao.insertService(service);
        JOptionPane.showMessageDialog(this, "Ajout effectué avec succés");}
             }}
    }//GEN-LAST:event_but_ajouter_serv_demActionPerformed

    private void but_annuler_serv_dem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_annuler_serv_dem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_but_annuler_serv_dem1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cate;
    private javax.swing.JComboBox Combo_ajout_dem;
    private javax.swing.JTextField ajout_nom_servi_dem;
    private javax.swing.JButton but_ajouter_serv_dem;
    private javax.swing.JButton but_annuler_serv_dem1;
    private javax.swing.JTextArea desc_ajou_serv_dem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField otherCategorie_dem;
    // End of variables declaration//GEN-END:variables
}
