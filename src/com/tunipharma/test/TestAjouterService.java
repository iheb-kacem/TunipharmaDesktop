/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tunipharma.test;

import com.tunipharma.dao.*;
import com.tunipharma.entities.*;


public class TestAjouterService {
    
    
    public static void main(String[] args) {
    
        Service service = new Service();
        ServiceDAO serviceDao = new ServiceDAO();
        service.setCategorie("Produits de beaué");
        service.setNom("Parfums");
        serviceDao.insertService(service);
        
    }
}
