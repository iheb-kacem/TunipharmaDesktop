/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tunipharma.gui;

import com.tunipharma.dao.*;
import com.tunipharma.entities.*;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import com.tunipharma.util.MyLdapConnection;

/**
 *
 * @author Houcem
 */
public class AjouterPharmacie extends javax.swing.JPanel {

    PharmacieDAO pharmacieDao = new PharmacieDAO();
    PharmacienDAO pharmacienDao = new PharmacienDAO();
    UtilDAO utilDAO = new UtilDAO();

    public AjouterPharmacie() {
        initComponents();
    }

    private void initValues() {
        CBGouvernorat.setSelectedItem("");
        JourButton.setSelected(false);
        NuitButton.setSelected(false);
        jAdressePharmacie.setText("");
        jCIN.setText("");
        jMaiPharmacien.setText("");
        jMailPharmacie.setText("");
        jNomPharmacie.setText("");
        jNomPharmacien.setText("");
        jPrenom.setText("");
        jTelPharmacie.setText("");
        jTelPharmacien.setText("");
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jNomPharmacien = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPrenom = new javax.swing.JTextField();
        jCIN = new javax.swing.JTextField();
        jTelPharmacien = new javax.swing.JTextField();
        jMaiPharmacien = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jNomPharmacie = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jAdressePharmacie = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTelPharmacie = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jMailPharmacie = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        CBGouvernorat =  new JComboBox((utilDAO.getAllGouvernorats()));
        CBDelegation = new javax.swing.JComboBox();
        CBCodePostal = new javax.swing.JComboBox();
        jButtonAjouter = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        JourButton = new javax.swing.JRadioButton();
        NuitButton = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        map1 = new com.tunipharma.gui.Map();

        setMaximumSize(new java.awt.Dimension(800, 579));
        setMinimumSize(new java.awt.Dimension(800, 579));
        setPreferredSize(new java.awt.Dimension(800, 579));

        jTabbedPane1.setMaximumSize(new java.awt.Dimension(800, 579));
        jTabbedPane1.setMinimumSize(new java.awt.Dimension(800, 579));
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(800, 579));

        jPanel2.setMaximumSize(new java.awt.Dimension(800, 579));
        jPanel2.setMinimumSize(new java.awt.Dimension(800, 579));
        jPanel2.setPreferredSize(new java.awt.Dimension(800, 579));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Nom : ");

        jNomPharmacien.setMaximumSize(new java.awt.Dimension(6, 20));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Prénom : ");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 0));
        jLabel4.setText("Pharmacien");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("CIN : ");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Télephone : ");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Adresse Mail : ");

        jPrenom.setMaximumSize(new java.awt.Dimension(20, 20));
        jPrenom.setPreferredSize(new java.awt.Dimension(20, 20));

        jCIN.setMaximumSize(new java.awt.Dimension(20, 20));
        jCIN.setPreferredSize(new java.awt.Dimension(20, 20));

        jTelPharmacien.setMaximumSize(new java.awt.Dimension(20, 20));
        jTelPharmacien.setPreferredSize(new java.awt.Dimension(20, 20));

        jMaiPharmacien.setMaximumSize(new java.awt.Dimension(20, 20));
        jMaiPharmacien.setPreferredSize(new java.awt.Dimension(20, 20));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 0));
        jLabel8.setText("Pharmacie");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Nom : ");

        jNomPharmacie.setMaximumSize(new java.awt.Dimension(6, 20));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Adresse : ");

        jAdressePharmacie.setMaximumSize(new java.awt.Dimension(6, 20));
        jAdressePharmacie.setPreferredSize(new java.awt.Dimension(20, 20));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Type : ");

        jTelPharmacie.setMaximumSize(new java.awt.Dimension(6, 20));
        jTelPharmacie.setPreferredSize(new java.awt.Dimension(20, 20));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Télephone : ");

        jMailPharmacie.setMaximumSize(new java.awt.Dimension(6, 20));
        jMailPharmacie.setPreferredSize(new java.awt.Dimension(20, 20));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Adresse Mail : ");

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Gouvernorat : ");

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Délegation : ");

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("Code Postal : ");

        CBGouvernorat.setActionCommand("GouvernoratChanged");
        CBGouvernorat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBGouvernoratActionPerformed(evt);
            }
        });

        CBDelegation.setActionCommand("DelegationChanged");
        CBDelegation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBDelegationActionPerformed(evt);
            }
        });

        CBCodePostal.setActionCommand("CodePostalChanged");

        jButtonAjouter.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButtonAjouter.setText("Ajouter");
        jButtonAjouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAjouterActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setText("Initialiser");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(JourButton);
        JourButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        JourButton.setText("Pharmacie de Jour");
        JourButton.setActionCommand("Jour");

        buttonGroup1.add(NuitButton);
        NuitButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        NuitButton.setText("Pharmacie de Nuit");
        NuitButton.setActionCommand("Nuit");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jMailPharmacie, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                                .addComponent(jTelPharmacie, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(JourButton)
                                .addGap(10, 10, 10)
                                .addComponent(NuitButton)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jAdressePharmacie, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                                        .addComponent(jNomPharmacie, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CBGouvernorat, 0, 232, Short.MAX_VALUE)
                                    .addComponent(CBDelegation, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(CBCodePostal, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                                .addComponent(jButtonAjouter, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(117, 117, 117))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jTelPharmacien, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jCIN, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPrenom, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jNomPharmacien, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jMaiPharmacien, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(47, 47, 47)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jNomPharmacien, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jCIN, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(2, 2, 2)
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTelPharmacien, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jMaiPharmacien, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jNomPharmacie, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jAdressePharmacie, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(CBGouvernorat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(CBDelegation, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(CBCodePostal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTelPharmacie, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jMailPharmacie, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JourButton)
                    .addComponent(NuitButton))
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAjouter, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(79, 79, 79))
        );

        jTabbedPane1.addTab("Pharmacie", jPanel2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(map1, javax.swing.GroupLayout.DEFAULT_SIZE, 795, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(map1, javax.swing.GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Carte", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void CBGouvernoratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBGouvernoratActionPerformed
        if (evt.getActionCommand().equals("GouvernoratChanged") && CBGouvernorat.getSelectedItem() != null) {
            CBDelegation.removeAllItems();
            for (String delegation : utilDAO.getDelegations(CBGouvernorat.getSelectedItem().toString())) {
                CBDelegation.addItem(delegation);
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

    private void jButtonAjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAjouterActionPerformed
        if (evt.getActionCommand().equals("Ajouter")) {
            Pharmacie ph = new Pharmacie();    // Nouvelle pharmacie
            Pharmacien phn = new Pharmacien(); // Nouveau pharmacien

            // Les donnees de la nouvelle pharmacie    
             if((jNomPharmacie.getText().length()==0))
            {
            
           
           JOptionPane.showMessageDialog(this, "Champs nom du pharmacie vide");
            }
                
             else if (jTelPharmacie.getText().length()!=8){
                JOptionPane.showMessageDialog(this, "Champs téléphone du pharmacie vide");
                }
             else if (jMailPharmacie.getText().length()==0){
                JOptionPane.showMessageDialog(this, "Champs mail du pharmacie vide");
                }
//              else if ((NuitButton.isSelected()==false)||(JourButton.isSelected()==false)){
//                JOptionPane.showMessageDialog(this, "Champs type du pharmacie vide");
//                }
           
                else if (jAdressePharmacie.getText().length()==0){
                JOptionPane.showMessageDialog(this, "Champs adresse du pharmacie vide");
                }
                  else if (jNomPharmacien.getText().length()==0){
                JOptionPane.showMessageDialog(this, "Champs nom pharmacien du pharmacie vide");
                }
                   
          else if (jPrenom.getText().length()==0){
                JOptionPane.showMessageDialog(this, "Champs prenom pharmacien du pharmacie vide");
                }
            else if (jCIN.getText().length()!=9){
                JOptionPane.showMessageDialog(this, "Champs CIN pharmacien du pharmacie vide");
                }
            else if (jTelPharmacien.getText().length()!=8){
                JOptionPane.showMessageDialog(this, "Champs téléphone du pharmacie vide");
                }
            
             else if (jMaiPharmacien.getText().length()==0){
                JOptionPane.showMessageDialog(this, "Champs mail pharmacien du pharmacie vide");
                }
              else {
                   ph.setCodePostal(Integer.parseInt(CBCodePostal.getSelectedItem().toString()));
            ph.setName(jNomPharmacie.getText());
            
             
//         if(jAdressePharmacie.getText().length()==0){
//              JOptionPane.showMessageDialog(this, "Champs adresse du pharmacie vide");
//            }
//            else {
            ph.setAdresse(jAdressePharmacie.getText());
         
//         if(jTelPharmacie.getText().length()==0){
//              JOptionPane.showMessageDialog(this, "Champs telephone du pharmacie vide");
//            }
//            else {
            ph.setNumTel(jTelPharmacie.getText());
         
//         if(jMailPharmacie.getText().length()==0){
//              JOptionPane.showMessageDialog(this, "Champs email du pharmacie vide");
//            }
//            else {
            ph.seteMail(jMailPharmacie.getText());
         
//         if((NuitButton.isSelected()==false) &&(JourButton.isSelected()==false))
//         {JOptionPane.showMessageDialog(this, "Champs type du pharmacie vide");
//            }
//            else {
            if (NuitButton.isSelected()) {
                ph.setType(NuitButton.getText());
            }
            if (JourButton.isSelected()) {
                ph.setType(JourButton.getText());
            }
//        if(CBCodePostal.getSelectedIndex()!=-1){
//            JOptionPane.showMessageDialog(this, "Champs code postal du pharmacie vide");
//         }
//         else {
           
            ph.setEtat("active");
            ph.setLocation(map1.getLocalisation());
          
            // Les donnees du nouveau  pharmacien
            phn.setNom(jNomPharmacien.getText());
            phn.setPrenom(jPrenom.getText());
            phn.setCin(Integer.parseInt(jCIN.getText()));
            phn.setNumTel(jTelPharmacien.getText());
            phn.seteMail(jMaiPharmacien.getText());
            phn.setEtat("active");

            phn = pharmacienDao.insertPharmacien(phn);
            ph.setPharmacien(phn);
            pharmacieDao.insertPhamacie(ph);
            if(MyLdapConnection.setUser(phn.getNom(),phn.getRef()+"",phn.getNom())){
                JOptionPane.showMessageDialog(this, "Ajout éffectué avec succée.");
            }
            initValues();
             }
        }
    }//GEN-LAST:event_jButtonAjouterActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (evt.getActionCommand().equals("Initialiser")) {
            initValues();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox CBCodePostal;
    private javax.swing.JComboBox CBDelegation;
    private javax.swing.JComboBox CBGouvernorat;
    private javax.swing.JRadioButton JourButton;
    private javax.swing.JRadioButton NuitButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JTextField jAdressePharmacie;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonAjouter;
    private javax.swing.JTextField jCIN;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jMaiPharmacien;
    private javax.swing.JTextField jMailPharmacie;
    private javax.swing.JTextField jNomPharmacie;
    private javax.swing.JTextField jNomPharmacien;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jPrenom;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTelPharmacie;
    private javax.swing.JTextField jTelPharmacien;
    private com.tunipharma.gui.Map map1;
    // End of variables declaration//GEN-END:variables
}
