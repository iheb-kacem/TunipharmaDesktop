package com.tunipharma.gui;

import com.tunipharma.statistique.STATPharmacie;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MainInterface extends javax.swing.JFrame {

    public MainInterface() {
        initComponents();
        this.setTitle("TuniPharma");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        mainPanel = new javax.swing.JPanel();
        jMenuBar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem1 = new javax.swing.JMenuItem();
        menu_pharmacie = new javax.swing.JMenu();
        item_menu_ajouter_pharma = new javax.swing.JMenuItem();
        item_menu_lister_pharma = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        menu_service = new javax.swing.JMenu();
        item_menu_ajouter_service = new javax.swing.JMenuItem();
        item_menu_lister_service = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        stat = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();

        jMenu3.setText("File");
        jMenuBar1.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar1.add(jMenu4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 579, Short.MAX_VALUE)
        );

        jMenu1.setText("Fichier");
        jMenu1.add(jSeparator1);

        jMenuItem1.setText("Exit");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar.add(jMenu1);

        menu_pharmacie.setText("Pharmacies");

        item_menu_ajouter_pharma.setText("Ajouter Pharmacie");
        item_menu_ajouter_pharma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_menu_ajouter_pharmaActionPerformed(evt);
            }
        });
        menu_pharmacie.add(item_menu_ajouter_pharma);

        item_menu_lister_pharma.setText("Liste des Pharmacies");
        item_menu_lister_pharma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_menu_lister_pharmaActionPerformed(evt);
            }
        });
        menu_pharmacie.add(item_menu_lister_pharma);

        jMenuItem3.setText("Liste des Demandes d'Ajout");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        menu_pharmacie.add(jMenuItem3);

        jMenuBar.add(menu_pharmacie);

        menu_service.setText("Services");

        item_menu_ajouter_service.setText("Ajouter Service");
        item_menu_ajouter_service.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_menu_ajouter_serviceActionPerformed(evt);
            }
        });
        menu_service.add(item_menu_ajouter_service);

        item_menu_lister_service.setText("Liste des Services");
        item_menu_lister_service.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_menu_lister_serviceActionPerformed(evt);
            }
        });
        menu_service.add(item_menu_lister_service);

        jMenuItem2.setText("Liste des Demandes d'ajout");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        menu_service.add(jMenuItem2);

        jMenuBar.add(menu_service);

        stat.setText("Statistiques");
        stat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                statMouseClicked(evt);
            }
        });
        stat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statActionPerformed(evt);
            }
        });
        jMenuBar.add(stat);

        jMenu5.setText("Rapports");

        jMenuItem5.setText("Génerer des rapports");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem5);

        jMenuBar.add(jMenu5);

        jMenu2.setText("?");

        jMenuItem4.setText("A propos");
        jMenu2.add(jMenuItem4);

        jMenuBar.add(jMenu2);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void item_menu_ajouter_pharmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_menu_ajouter_pharmaActionPerformed
        if (evt.getActionCommand().equals("Ajouter Pharmacie")) {
            remove(mainPanel);
            mainPanel = new AjouterPharmacie();
            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
            layout.setVerticalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
            pack();
        }
    }//GEN-LAST:event_item_menu_ajouter_pharmaActionPerformed

    private void item_menu_lister_pharmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_menu_lister_pharmaActionPerformed
        if (evt.getActionCommand().equals("Liste des Pharmacies")) {
            remove(mainPanel);
            mainPanel = new ListerPharmacie("active");
            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
            layout.setVerticalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
            pack();
        }
    }//GEN-LAST:event_item_menu_lister_pharmaActionPerformed

    private void item_menu_lister_serviceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_menu_lister_serviceActionPerformed
        //JOptionPane.showMessageDialog(this, "Methode existante à implémenter; affichage du panel lié.");
        if (evt.getActionCommand().equals("Liste des Services")){
         remove(mainPanel);
            mainPanel = new ListeService("active");
            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
            layout.setVerticalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
            pack();
        }
    }//GEN-LAST:event_item_menu_lister_serviceActionPerformed

    private void item_menu_ajouter_serviceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_menu_ajouter_serviceActionPerformed
        if (evt.getActionCommand().equals("Ajouter Service")) {
            remove(mainPanel);
            mainPanel = new Ajouter_service();
            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
            layout.setVerticalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
            pack();
        }
    }//GEN-LAST:event_item_menu_ajouter_serviceActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        if(evt.getActionCommand().equals("Exit")){
            System.exit(0);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        if (evt.getActionCommand().equals("Liste des Demandes d'Ajout")) {
            remove(mainPanel);
            mainPanel = new ListerPharmacie("en demande");
            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
            layout.setVerticalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
            pack();
        }
    }                                                        

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        if (evt.getActionCommand().equals("Liste des Demandes d'ajout")){
            remove(mainPanel);
            mainPanel = new ListeService("demande");
            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
            layout.setVerticalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
            pack();
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void statActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statActionPerformed
        // TODO add your handling code here:
        afficheStat();
        
    }//GEN-LAST:event_statActionPerformed

    private void statMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_statMouseClicked
        // TODO add your handling code here:
        afficheStat();
    }//GEN-LAST:event_statMouseClicked

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        if(evt.getActionCommand().equals("Génerer des rapports")){
            remove(mainPanel);
            mainPanel = new Rapports();
            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
            layout.setVerticalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
            pack();
        }
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void afficheStat(){
        try {
            STATPharmacie sph= new STATPharmacie();
            sph.setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MainInterface.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MainInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //MainInterface main_frame = new MainInterface();
                //main_frame.setTitle("TuniPharma 0.1");
                //main_frame.setVisible(true);
                new MainInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem item_menu_ajouter_pharma;
    private javax.swing.JMenuItem item_menu_ajouter_service;
    private javax.swing.JMenuItem item_menu_lister_pharma;
    private javax.swing.JMenuItem item_menu_lister_service;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JMenu menu_pharmacie;
    private javax.swing.JMenu menu_service;
    private javax.swing.JMenu stat;
    // End of variables declaration//GEN-END:variables
}
