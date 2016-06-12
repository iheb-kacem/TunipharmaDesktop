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
public class TestAjouterPharmacie {
    public static void main(String[] args) {
    
        Pharmacie ph = new Pharmacie();
        Pharmacien phn = new Pharmacien("Neji","Nejar",88889999, "");
        PharmacieDAO pharmacieDao = new PharmacieDAO();
        ph.setName("PharmacieEsprit");
        ph.setPharmacien(phn);
        ph.setType("Pharmacie de nuit");
        ph.setNumTel("4000333");
        ph.seteMail("phesprit@gmail.com");
        ph.setAdresse("El Ghazela ,Arian ");
        ph.setCodePostal(2088);
        
       
        pharmacieDao.insertPhamacie(ph);
}
}