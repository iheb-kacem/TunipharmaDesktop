/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tunipharma.gui;
import com.tunipharma.dao.*;
import com.tunipharma.entities.*;
import java.util.Calendar;
import java.util.List;
import java.util.Calendar.*;
/**
 *
 * @author Houcem
 */
public class JourGarde extends javax.swing.JPanel {

    PharmacieDAO pharmacieDao = new PharmacieDAO();
    GardeDAO gardeDao = new GardeDAO();
    UtilDAO utilDAO = new UtilDAO();
    public JourGarde() {
        initComponents();
    }
private void initValues() {
        
        jNomPharmacie.setText("");
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jNomPharmacie = new javax.swing.JTextField();
        jAjouterButton = new javax.swing.JToggleButton();
        jInitialiserButton = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();
        CBGouvernorat = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        CBDelegation = new javax.swing.JComboBox();
        CBCodePostal = new javax.swing.JComboBox();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        setMaximumSize(new java.awt.Dimension(800, 579));
        setMinimumSize(new java.awt.Dimension(800, 579));
        setPreferredSize(new java.awt.Dimension(800, 579));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Semaine de garde :");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Pharmacie :");

        jNomPharmacie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNomPharmacieActionPerformed(evt);
            }
        });

        jAjouterButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jAjouterButton.setText("Ajouter");
        jAjouterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAjouterButtonActionPerformed(evt);
            }
        });

        jInitialiserButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jInitialiserButton.setText("Initialiser");
        jInitialiserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jInitialiserButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Gouvernorat :");

        CBGouvernorat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBGouvernoratActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Delegation :");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Code Postal :");

        CBDelegation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBDelegationActionPerformed(evt);
            }
        });

        CBCodePostal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBCodePostalActionPerformed(evt);
            }
        });

        jDateChooser1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 270, Short.MAX_VALUE)
                                .addComponent(jAjouterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(jInitialiserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(CBDelegation, 0, 340, Short.MAX_VALUE)
                                    .addComponent(CBCodePostal, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CBGouvernorat, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jNomPharmacie, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jNomPharmacie, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(CBGouvernorat, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(CBDelegation, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(CBCodePostal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jInitialiserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jAjouterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jAjouterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAjouterButtonActionPerformed
        if (evt.getActionCommand().equals("Ajouter")) {
           Calendar cal = new Calendar() {

               @Override
               protected void computeTime() {
                   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
               }

               @Override
               protected void computeFields() {
                   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
               }

               @Override
               public void add(int field, int amount) {
                   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
               }

               @Override
               public void roll(int field, boolean up) {
                   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
               }

               @Override
               public int getMinimum(int field) {
                   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
               }

               @Override
               public int getMaximum(int field) {
                   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
               }

               @Override
               public int getGreatestMinimum(int field) {
                   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
               }

               @Override
               public int getLeastMaximum(int field) {
                   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
               }
           };
          
         
        }
    }//GEN-LAST:event_jAjouterButtonActionPerformed

    private void jNomPharmacieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNomPharmacieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jNomPharmacieActionPerformed

    private void jInitialiserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jInitialiserButtonActionPerformed
        if (evt.getActionCommand().equals("Initialiser")) {
            initValues();
        }
    }//GEN-LAST:event_jInitialiserButtonActionPerformed

    private void CBGouvernoratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBGouvernoratActionPerformed
        
        if (evt.getActionCommand().equals("GouvernoratChanged") && CBGouvernorat.getSelectedItem() != null) {
            CBGouvernorat.removeAllItems();
            for (String delegation : utilDAO.getDelegations(CBGouvernorat.getSelectedItem().toString())) {
                CBGouvernorat.addItem(delegation);
            }
        }
    }//GEN-LAST:event_CBGouvernoratActionPerformed

    private void CBDelegationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBDelegationActionPerformed
     if (evt.getActionCommand().equals("DelegationChanged") && CBGouvernorat.getSelectedItem() != null && CBDelegation.getSelectedItem() != null) {
            CBCodePostal.removeAllItems();
            for (String code : utilDAO.getCodePostals(CBGouvernorat.getSelectedItem().toString(), CBDelegation.getSelectedItem().toString())) {
                CBCodePostal.addItem(code);
            }
        }
    }//GEN-LAST:event_CBDelegationActionPerformed

    private void CBCodePostalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBCodePostalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBCodePostalActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox CBCodePostal;
    private javax.swing.JComboBox CBDelegation;
    private javax.swing.JComboBox CBGouvernorat;
    private javax.swing.JToggleButton jAjouterButton;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JToggleButton jInitialiserButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jNomPharmacie;
    // End of variables declaration//GEN-END:variables



    

}


