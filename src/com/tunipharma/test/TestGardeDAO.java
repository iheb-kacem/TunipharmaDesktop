/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tunipharma.test;

import com.tunipharma.dao.PharmacieDAO;
import com.tunipharma.entities.Pharmacie;
import com.tunipharma.gui.*;
import java.awt.HeadlessException;
import javax.swing.JFrame;

/**
 *
 * @author PLAYER9
 */
public class TestGardeDAO extends JFrame{

    public TestGardeDAO() throws HeadlessException {
        add(new Rapports());
        pack();
        setVisible(true);
    }
    
    
    
    public static void main(String[] args) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TestGardeDAO();
            }
        });
        
    }
}
