/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tunipharma.gui;

import com.tunipharma.dao.ServiceDAO;
import com.tunipharma.entities.Service;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

/**
 *
 * @author Ferdawes
 */
public class Modifier_service extends javax.swing.JFrame {

    /**
     * Creates new form Modifier_service
     */
    Service service = new Service();
    ServiceDAO servicedao = new ServiceDAO();
    Service ser;

    private Modifier_service() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void initValues() {

        modif_categ.setText(service.getCategorie() + "");
        modif_nom.setText(service.getNom() + "");
        Modif_descp.setText(service.getDescription() + "");

    }

    Modifier_service(Service service) {

        initComponents();
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.service = service;
        initValues();
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        jLabel2 = new javax.swing.JLabel();
        nom_modif = new javax.swing.JLabel();
        modif_nom = new javax.swing.JTextField();
        modif_descrip = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Modif_descp = new javax.swing.JTextArea();
        but_Annuler_serv = new javax.swing.JButton();
        but_modifi_serv1 = new javax.swing.JButton();
        modif_categ = new javax.swing.JLabel();
        but_igno_serv2 = new javax.swing.JButton();
        but_appro_serv3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 579));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 0));
        jLabel1.setText("Modifier service");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Catégorie :");

        nom_modif.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        nom_modif.setText("Nom :");

        modif_descrip.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        modif_descrip.setText("Description :");

        Modif_descp.setColumns(20);
        Modif_descp.setRows(5);
        jScrollPane1.setViewportView(Modif_descp);

        but_Annuler_serv.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        but_Annuler_serv.setText("Annuler");
        but_Annuler_serv.setToolTipText("");
        but_Annuler_serv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_Annuler_servActionPerformed(evt);
            }
        });

        but_modifi_serv1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        but_modifi_serv1.setText("Modifier");
        but_modifi_serv1.setToolTipText("");
        but_modifi_serv1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_modifi_serv1ActionPerformed(evt);
            }
        });

        but_igno_serv2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        but_igno_serv2.setText("Ignorer");
        but_igno_serv2.setToolTipText("");
        but_igno_serv2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_igno_serv2ActionPerformed(evt);
            }
        });

        but_appro_serv3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        but_appro_serv3.setText("Approuver");
        but_appro_serv3.setToolTipText("");
        but_appro_serv3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_appro_serv3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(311, 311, 311)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(modif_descrip)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nom_modif, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
                            .addComponent(modif_nom)
                            .addComponent(modif_categ, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(but_appro_serv3, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(but_igno_serv2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(135, 135, 135)
                        .addComponent(but_modifi_serv1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(but_Annuler_serv, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel1)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(modif_categ, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modif_nom, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nom_modif))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(modif_descrip, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(but_igno_serv2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(but_appro_serv3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(but_modifi_serv1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(but_Annuler_serv, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(190, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void init() {
        modif_nom.setText(service.getNom());

        Modif_descp.setText(service.getDescription());

    }
    private void but_Annuler_servActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_Annuler_servActionPerformed
        if (evt.getActionCommand().equals("Annuler")) {
            init();
        }
    }//GEN-LAST:event_but_Annuler_servActionPerformed

    private void but_modifi_serv1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_modifi_serv1ActionPerformed
        if (evt.getActionCommand().equals("Modifier")) {
            service.setNom(modif_nom.getText());
            service.setDescription(Modif_descp.getText());
            servicedao.updateService(service);
            JOptionPane.showMessageDialog(this, "Modification éffectué avec succée.");
        }
    }//GEN-LAST:event_but_modifi_serv1ActionPerformed

    private void but_igno_serv2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_igno_serv2ActionPerformed
        if (evt.getActionCommand().equals("Ignorer")) {
            if (JOptionPane.showConfirmDialog(this, "Voulez Vous Supprimer cette demande") == 0) {
                
                servicedao.deleteService(service);
                this.setVisible(false);
            }
        }
    }//GEN-LAST:event_but_igno_serv2ActionPerformed

    private void but_appro_serv3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_appro_serv3ActionPerformed
       if (evt.getActionCommand().equals("Approuver")) {
            if (JOptionPane.showConfirmDialog(this, "Voulez Vous Accépter cette demande") == 0) {
                service.setEtat("active");
                
                servicedao.updateService(service);
                this.setVisible(false);
            }}
    }//GEN-LAST:event_but_appro_serv3ActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Modif_descp;
    private javax.swing.JButton but_Annuler_serv;
    private javax.swing.JButton but_appro_serv3;
    private javax.swing.JButton but_igno_serv2;
    private javax.swing.JButton but_modifi_serv1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel modif_categ;
    private javax.swing.JLabel modif_descrip;
    private javax.swing.JTextField modif_nom;
    private javax.swing.JLabel nom_modif;
    // End of variables declaration//GEN-END:variables
}
