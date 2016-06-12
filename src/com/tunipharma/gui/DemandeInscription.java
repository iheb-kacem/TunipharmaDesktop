/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
//author asma

package com.tunipharma.gui;

import com.tunipharma.dao.PharmacieDAO;
import com.tunipharma.dao.PharmacienDAO;
import com.tunipharma.dao.UtilDAO;
import com.tunipharma.entities.Pharmacie;
import com.tunipharma.entities.Pharmacien;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author asma
 */
//dmd
public class DemandeInscription extends javax.swing.JFrame {

    PharmacieDAO pharmacieDao = new PharmacieDAO();
    PharmacienDAO pharmacienDao = new PharmacienDAO();
    UtilDAO utilDAO = new UtilDAO();

    public DemandeInscription() {
        initComponents();
    }

    private void initvaleurs() {
        tgouvernorat.setSelectedItem("");
        tjour.setSelected(false);
        tnuit.setSelected(false);
        taddresse.setText("");
        tnom.setText("");
        tdelegation.setSelectedItem("");
        tcodepostal.setSelectedItem("");
        ttel.setText("");
        temail.setText("");
        //pour pharmacien
        jnom.setText("");
        jprenom.setText("");
        jcin.setText("");
        jtel.setText("");
        jmail.setText("");


    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField8 = new javax.swing.JTextField();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jnom = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jprenom = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jcin = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jmail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtel = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        tnom = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        taddresse = new javax.swing.JTextField();
        gouvernat = new javax.swing.JLabel();
        tgouvernorat = new JComboBox((utilDAO.getAllGouvernorats()));
        jLabel13 = new javax.swing.JLabel();
        tdelegation = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();
        tcodepostal = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        ttel = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        temail = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        tjour = new javax.swing.JRadioButton();
        jLabel17 = new javax.swing.JLabel();
        tnuit = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jinitialiser = new javax.swing.JButton();
        jenvoyer = new javax.swing.JButton();

        jTextField8.setText("jTextField8");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 102, 0));
        jLabel1.setText("demande d'ajout d'une pharmacie");

        jPanel2.setLayout(new java.awt.GridLayout(6, 2, 0, 10));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Nom");
        jLabel2.setPreferredSize(new java.awt.Dimension(31, 22));
        jPanel2.add(jLabel2);

        jnom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jnomActionPerformed(evt);
            }
        });
        jPanel2.add(jnom);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("Prénom");
        jPanel2.add(jLabel6);
        jPanel2.add(jprenom);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("CIN");
        jPanel2.add(jLabel3);
        jPanel2.add(jcin);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("E-mail");
        jPanel2.add(jLabel7);
        jPanel2.add(jmail);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Téléphone");
        jPanel2.add(jLabel4);
        jPanel2.add(jtel);

        jPanel3.setLayout(new java.awt.GridLayout(9, 2, 0, 15));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setText("Nom");
        jPanel3.add(jLabel11);
        jPanel3.add(tnom);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setText("Adresse");
        jPanel3.add(jLabel8);
        jPanel3.add(taddresse);

        gouvernat.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        gouvernat.setText("Gouvernorat");
        jPanel3.add(gouvernat);

        tgouvernorat.setActionCommand("gouvernoratChanged");
        tgouvernorat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tgouvernoratActionPerformed(evt);
            }
        });
        jPanel3.add(tgouvernorat);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel13.setText("Délegation");
        jPanel3.add(jLabel13);

        tdelegation.setToolTipText("");
        tdelegation.setActionCommand("delegationChanged");
        tdelegation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tdelegationActionPerformed(evt);
            }
        });
        jPanel3.add(tdelegation);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel14.setText("Code postal");
        jPanel3.add(jLabel14);

        jPanel3.add(tcodepostal);

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel15.setText("Téléphone");
        jPanel3.add(jLabel15);
        jPanel3.add(ttel);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel12.setText("E-mail");
        jPanel3.add(jLabel12);
        jPanel3.add(temail);

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel16.setText("Type");
        jPanel3.add(jLabel16);

        tjour.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        tjour.setText("Jour");
        tjour.setToolTipText("");
        jPanel3.add(tjour);
        jPanel3.add(jLabel17);

        tnuit.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        tnuit.setText("Nuit");
        jPanel3.add(tnuit);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 0));
        jLabel9.setText("Pharmacien");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 0));
        jLabel10.setText("pharmacie");

        jinitialiser.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jinitialiser.setText("Initialiser");
        jinitialiser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jinitialiserActionPerformed(evt);
            }
        });

        jenvoyer.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jenvoyer.setText("Envoyer");
        jenvoyer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jenvoyerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jLabel9))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(175, 175, 175))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jinitialiser)
                .addGap(45, 45, 45)
                .addComponent(jenvoyer)
                .addGap(58, 58, 58))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(212, 212, 212)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(159, 159, 159))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jinitialiser)
                    .addComponent(jenvoyer))
                .addGap(0, 23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jinitialiserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jinitialiserActionPerformed
 
            
   if (evt.getActionCommand().equals("initialiser")) {
            initvaleurs();
        }
    }//GEN-LAST:event_jinitialiserActionPerformed

    private void jenvoyerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jenvoyerActionPerformed
        // TODO add your handling code here:
        if (evt.getActionCommand().equals("Envoyer")) {
            Pharmacie ph = new Pharmacie();    
            Pharmacien phn = new Pharmacien(); 
             //pour pharmacien
             phn.setNom(jnom.getText());
            phn.setPrenom(jprenom.getText());
            phn.setCin(Integer.parseInt(jcin.getText()));
            phn.setNumTel(jtel.getText());
            phn.seteMail(jmail.getText());
            phn.setEtat("en demande");
            
            phn = pharmacienDao.insertPharmacien(phn);
            
            //pour les pharmacie
            ph.setName(tnom.getText());
            ph.setAdresse(taddresse.getText());
            ph.setNumTel(ttel.getText());
            ph.seteMail(temail.getText());
             if (tnuit.isSelected()) {
                ph.setType("Pharmacie de Nuit");
            }
            if (tjour.isSelected()) {
                ph.setType("Pharmacie de Jour");
            }
            ph.setCodePostal(Integer.parseInt(tcodepostal.getSelectedItem().toString()));
            ph.setEtat("en demande");
            ph.setPharmacien(phn);
            
            pharmacieDao.insertPhamacie(ph);
            
             JOptionPane.showMessageDialog(this, "Ajout éffectué avec succée.");
             initvaleurs();}
             
    }//GEN-LAST:event_jenvoyerActionPerformed

    private void tgouvernoratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tgouvernoratActionPerformed
        if (evt.getActionCommand().equals("gouvernoratChanged") && tgouvernorat.getSelectedItem() != null) {
            tdelegation.removeAllItems(); 
            for (String delegation : utilDAO.getDelegations(tgouvernorat.getSelectedItem().toString())) {
                tdelegation.addItem(delegation);
                
            }
        }
    }//GEN-LAST:event_tgouvernoratActionPerformed

    private void tdelegationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tdelegationActionPerformed
        if (evt.getActionCommand().equals("delegationChanged") && tgouvernorat.getSelectedItem() != null && tdelegation.getSelectedItem() != null) {
            tcodepostal.removeAllItems();
            for (String code : utilDAO.getCodePostals(tgouvernorat.getSelectedItem().toString(), tdelegation.getSelectedItem().toString())) {
                tcodepostal.addItem(code);
            }
        }
    }//GEN-LAST:event_tdelegationActionPerformed

    private void jnomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jnomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jnomActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JLabel gouvernat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jcin;
    private javax.swing.JButton jenvoyer;
    private javax.swing.JButton jinitialiser;
    private javax.swing.JTextField jmail;
    private javax.swing.JTextField jnom;
    private javax.swing.JTextField jprenom;
    private javax.swing.JTextField jtel;
    private javax.swing.JTextField taddresse;
    private javax.swing.JComboBox tcodepostal;
    private javax.swing.JComboBox tdelegation;
    private javax.swing.JTextField temail;
    private javax.swing.JComboBox tgouvernorat;
    private javax.swing.JRadioButton tjour;
    private javax.swing.JTextField tnom;
    private javax.swing.JRadioButton tnuit;
    private javax.swing.JTextField ttel;
    // End of variables declaration//GEN-END:variables
}
