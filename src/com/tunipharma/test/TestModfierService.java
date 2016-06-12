/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tunipharma.test;

import com.tunipharma.dao.*;
import com.tunipharma.entities.*;
public class TestModfierService {
    public static void main(String[] args) {

        Service service = new Service();
        ServiceDAO serviceDao = new ServiceDAO();
        // Mise a jour d'un service 
        
        service = serviceDao.findServiceById(2);
        service.setNom("Soins de peau");
        //serviceDao.updateService(service);
        serviceDao.updateService(service);
        
    }
}
