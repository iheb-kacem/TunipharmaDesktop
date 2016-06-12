/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tunipharma.test;
import com.tunipharma.dao.*;
import com.tunipharma.entities.*;
/**
 *
 * @author Houcem
 */
public class TestModifierPharmacie {
  public static void main(String[] args) {
    
        Pharmacie ph = new Pharmacie();
        PharmacieDAO pharmacieDao = new PharmacieDAO();
        
        ph = pharmacieDao.findPhamacieById(3);
        ph.setNumTel("55447896");
        
        pharmacieDao.updatePhamacie(ph);
        
        
  
  }  
}
