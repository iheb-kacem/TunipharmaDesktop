/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tunipharma.gui;

import com.tunipharma.dao.PharmacieDAO;
import com.tunipharma.dao.UtilDAO;
import com.tunipharma.entities.Pharmacie;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Houcem
 */
public class ListerPharmacie extends javax.swing.JPanel {

    /**
     * 
     * Creates new form ListerPharmacie
     */
    
    /*  */
    UtilDAO utilDAO = new UtilDAO();
    PharmacieDAO pharmacieDAO = new PharmacieDAO();
    String etat;

    public ListerPharmacie(String etat) {
        this.etat = etat;
        initComponents();
        intialiseJTable();
    }

    private void intialiseJTable() {
        DefaultTableModel model = (DefaultTableModel) tablePharmacies.getModel();
        List<Pharmacie> pharmacies = pharmacieDAO.findPhamacieByEtat(etat);
        for (Pharmacie pharmacie : pharmacies) {
           // System.out.println(pharmacie);
            model.addRow(new Object[]{pharmacie.getId(), pharmacie.getName(), pharmacie.getAdresse(), utilDAO.getGouvernorats(pharmacie.getCodePostal()), utilDAO.getDelegation(pharmacie.getCodePostal()), pharmacie.getType()});
        }
        tablePharmacies.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu2 = new javax.swing.JMenu();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel9 = new javax.swing.JLabel();
        TNom = new javax.swing.JTextField();
        CBGouvernorat =  new JComboBox((utilDAO.getAllGouvernorats()));
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        CBDelegation = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        CBType =  new JComboBox((utilDAO.getPharmaciesTypes()));
        jScrollPane1 = new javax.swing.JScrollPane();
        tablePharmacies = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        jMenu2.setBackground(new java.awt.Color(0, 153, 0));
        jMenu2.setText("jMenu2");

        setMaximumSize(new java.awt.Dimension(800, 579));
        setMinimumSize(new java.awt.Dimension(800, 579));
        setPreferredSize(new java.awt.Dimension(800, 579));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Nom : ");

        CBGouvernorat.setActionCommand("GouvernoratChanged");
        CBGouvernorat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBGouvernoratActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Gouvernorat : ");

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Délegation : ");

        CBDelegation.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "" }));
        CBDelegation.setActionCommand("DelegationChanged");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Type : ");

        tablePharmacies.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nom", "Adresse", "Gouvernorat", "Delegation", "Type"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.Object.class, java.lang.String.class, java.lang.Long.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablePharmacies.getTableHeader().setReorderingAllowed(false);
        tablePharmacies.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablePharmaciesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablePharmacies);
        if (tablePharmacies.getColumnModel().getColumnCount() > 0) {
            tablePharmacies.getColumnModel().getColumn(0).setResizable(false);
            tablePharmacies.getColumnModel().getColumn(0).setPreferredWidth(30);
            tablePharmacies.getColumnModel().getColumn(1).setResizable(false);
            tablePharmacies.getColumnModel().getColumn(1).setPreferredWidth(200);
            tablePharmacies.getColumnModel().getColumn(2).setResizable(false);
            tablePharmacies.getColumnModel().getColumn(2).setPreferredWidth(300);
            tablePharmacies.getColumnModel().getColumn(3).setResizable(false);
            tablePharmacies.getColumnModel().getColumn(3).setPreferredWidth(100);
            tablePharmacies.getColumnModel().getColumn(4).setResizable(false);
            tablePharmacies.getColumnModel().getColumn(4).setPreferredWidth(100);
            tablePharmacies.getColumnModel().getColumn(5).setResizable(false);
            tablePharmacies.getColumnModel().getColumn(5).setPreferredWidth(150);
        }

        jButton1.setText("Chercher");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TNom)
                            .addComponent(CBType, 0, 200, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CBGouvernorat, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CBDelegation, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 13, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TNom, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CBType, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(CBGouvernorat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(CBDelegation, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
                .addContainerGap())
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (evt.getActionCommand().equals("Chercher")) {
            DefaultTableModel model = (DefaultTableModel) tablePharmacies.getModel();
            model.setRowCount(0);
            List<Pharmacie> pharmacies = pharmacieDAO.findPhamacieByEtat(etat);
            String nom = TNom.getText().toLowerCase();
            String type = CBType.getSelectedItem().toString().toLowerCase();
            String gouvernorat = CBGouvernorat.getSelectedItem().toString().toLowerCase();
            String delegation = CBDelegation.getSelectedItem().toString().toLowerCase();

            for (Pharmacie pharmacie : pharmacies) {
                if ((nom.isEmpty() || nom.equals(pharmacie.getName().toLowerCase()))
                        && (type.isEmpty() || type.equals(pharmacie.getType().toLowerCase()))
                        && (gouvernorat.isEmpty() || gouvernorat.equals(utilDAO.getGouvernorats(pharmacie.getCodePostal()).toLowerCase()))
                        && (delegation.isEmpty() || delegation.equals(utilDAO.getDelegation(pharmacie.getCodePostal()).toLowerCase()))) {
                    model.addRow(new Object[]{pharmacie.getId(), pharmacie.getName(), pharmacie.getAdresse(), utilDAO.getGouvernorats(pharmacie.getCodePostal()), utilDAO.getDelegation(pharmacie.getCodePostal()), pharmacie.getType()});
                }
            }
            tablePharmacies.setModel(model);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tablePharmaciesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablePharmaciesMouseClicked
        if (evt.getClickCount() == 2) {
            DefaultTableModel model = (DefaultTableModel) tablePharmacies.getModel();
            final int id = (int) model.getValueAt(tablePharmacies.getSelectedRow(), 0);
            java.awt.EventQueue.invokeLater(new Runnable() { 

                public void run() {
                    ConsultFrame cf = new ConsultFrame(pharmacieDAO.findPhamacieById(id));
                    cf.setVisible(true);
                    cf.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                }

            });
        }
    }//GEN-LAST:event_tablePharmaciesMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox CBDelegation;
    private javax.swing.JComboBox CBGouvernorat;
    private javax.swing.JComboBox CBType;
    private javax.swing.JTextField TNom;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablePharmacies;
    // End of variables declaration//GEN-END:variables

}