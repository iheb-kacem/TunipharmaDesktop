/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tunipharma.gui;

import com.tunipharma.dao.*;
import com.tunipharma.entities.*;
import com.tunipharma.util.MyLdapConnection;
import com.tunipharma.util.Mailling;
import java.util.Locale;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import java.util.UUID;

/**
 *
 * @author Houcem
 */
public class ConsulterPharmacie extends javax.swing.JPanel {

    PharmacieDAO pharmacieDao = new PharmacieDAO();
    PharmacienDAO pharmacienDao = new PharmacienDAO();
    UtilDAO utilDAO = new UtilDAO();
    Pharmacie ph;    //  pharmacie
    Pharmacien phn; //  pharmacien

    public ConsulterPharmacie(Pharmacie ph) {
        initComponents();
        this.ph = ph;
        this.phn = ph.getPharmacien();
        initValues();
        if(ph.getEtat().equals("active")){
            jButtonApprouver.setVisible(false);
        }
    }

    private void initValues() {
        CBGouvernorat.setSelectedItem(utilDAO.getGouvernorats(ph.getCodePostal()));
        CBDelegation.setSelectedItem(utilDAO.getDelegation(ph.getCodePostal()));
        CBCodePostal.setSelectedItem(ph.getCodePostal() + "");
        if (ph.getType().equals(JourButton.getText())) {
            JourButton.setSelected(true);
        }
        if (ph.getType().equals(NuitButton.getText())) {
            NuitButton.setSelected(true);
        }
        jAdressePharmacie.setText(ph.getAdresse());
        jCIN.setText(phn.getCin() + "");
        jMaiPharmacien.setText(phn.geteMail());
        jMailPharmacie.setText(ph.geteMail());
        jNomPharmacie.setText(ph.getName());
        jNomPharmacien.setText(phn.getNom());
        jPrenom.setText(phn.getPrenom());
        jTelPharmacie.setText(ph.getNumTel());
        jTelPharmacien.setText(phn.getNumTel());
        map1.addMapMarkerDot(ph.getLocation());
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
        jButtonApprouver = new javax.swing.JButton();
        jButtonSupprimer = new javax.swing.JButton();
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

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
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

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
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

        jButtonAjouter.setText("Modifier");
        jButtonAjouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAjouterActionPerformed(evt);
            }
        });

        jButton2.setText("Annuler");
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
        NuitButton.setToolTipText("");
        NuitButton.setActionCommand("Nuit");

        jButtonApprouver.setText("Approuver");
        jButtonApprouver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonApprouverActionPerformed(evt);
            }
        });

        jButtonSupprimer.setText("Supprimer");
        jButtonSupprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSupprimerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
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
                                .addComponent(jMaiPharmacien, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                                .addComponent(NuitButton)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(130, Short.MAX_VALUE)
                .addComponent(jButtonApprouver, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSupprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jButtonAjouter, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96))
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
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAjouter, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonApprouver, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSupprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68))
        );

        jTabbedPane1.addTab("Pharmacie", jPanel2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(map1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 795, Short.MAX_VALUE)
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
        if (evt.getActionCommand().equals("Modifier")) {
            executerUpdate();
            JOptionPane.showMessageDialog(this, "Modification éffectué avec succée.");
        }
    }//GEN-LAST:event_jButtonAjouterActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (evt.getActionCommand().equals("Annuler")) {
            initValues();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButtonSupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSupprimerActionPerformed
        if (evt.getActionCommand().equals("Supprimer")) {
            if (JOptionPane.showConfirmDialog(this, "Voulez Vous Supprimer cette pharmacie") == 0) {
                ph.setEtat("zombie");
                phn.setEtat("zombie");
                executerUpdate();
                this.setVisible(false);
            }
        }
    }//GEN-LAST:event_jButtonSupprimerActionPerformed

    private void jButtonApprouverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonApprouverActionPerformed
        if (evt.getActionCommand().equals("Approuver")) {
            if (JOptionPane.showConfirmDialog(this, "Voulez Vous Accépter cette demande") == 0) {
                ph.setEtat("active");
                phn.setEtat("active");
                executerApprouver();
                this.setVisible(false);
            }
        }
    }//GEN-LAST:event_jButtonApprouverActionPerformed

    private void executerUpdate() {
        // Les donnees de la nouvelle pharmacie        
        ph.setName(jNomPharmacie.getText());
        ph.setAdresse(jAdressePharmacie.getText());
        ph.setNumTel(jTelPharmacie.getText());
        ph.seteMail(jMailPharmacie.getText());
        if (NuitButton.isSelected()) {
            ph.setType(NuitButton.getText());
        }
        if (JourButton.isSelected()) {
            ph.setType(JourButton.getText());
        }
        ph.setCodePostal(Integer.parseInt(CBCodePostal.getSelectedItem().toString()));
        ph.setLocation(map1.getLocalisation());

        // Les donnees du nouveau  pharmacien
        phn.setNom(jNomPharmacien.getText());
        phn.setPrenom(jPrenom.getText());
        phn.setCin(Integer.parseInt(jCIN.getText()));
        phn.setNumTel(jTelPharmacien.getText());
        phn.seteMail(jMaiPharmacien.getText());

        pharmacienDao.updatePharmacien(phn);
        pharmacieDao.updatePhamacie(ph);
    }
    
    private void executerApprouver() {
        // Les donnees de la nouvelle pharmacie        
        ph.setName(jNomPharmacie.getText());
        ph.setAdresse(jAdressePharmacie.getText());
        ph.setNumTel(jTelPharmacie.getText());
        ph.seteMail(jMailPharmacie.getText());
        if (NuitButton.isSelected()) {
            ph.setType(NuitButton.getText());
        }
        if (JourButton.isSelected()) {
            ph.setType(JourButton.getText());
        }
        ph.setCodePostal(Integer.parseInt(CBCodePostal.getSelectedItem().toString()));
        ph.setLocation(map1.getLocalisation());

        // Les donnees du nouveau  pharmacien
        phn.setNom(jNomPharmacien.getText());
        phn.setPrenom(jPrenom.getText());
        phn.setCin(Integer.parseInt(jCIN.getText()));
        phn.setNumTel(jTelPharmacien.getText());
        phn.seteMail(jMaiPharmacien.getText());
        String ldap_nom = phn.getNom().substring(0, 3).toLowerCase(Locale.FRENCH) ;
        String ldap_prenom = phn.getPrenom().substring(0, 3).toLowerCase(Locale.FRENCH) ;
        String p = UUID.randomUUID().toString().substring(0, 4);
        if(MyLdapConnection.setUser(ldap_nom+ldap_prenom, ""+phn.getRef(),p)){
            pharmacienDao.updatePharmacien(phn);        
            pharmacieDao.updatePhamacie(ph);
            Mailling.sendMail(phn.geteMail(),ldap_nom+ldap_prenom, p);
        }
    }
    
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
    private javax.swing.JButton jButtonApprouver;
    private javax.swing.JButton jButtonSupprimer;
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
