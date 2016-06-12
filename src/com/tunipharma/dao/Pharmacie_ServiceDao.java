/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tunipharma.dao;

import com.tunipharma.entities.Localisation;
import com.tunipharma.entities.Pharmacie;
import com.tunipharma.entities.Pharmacie_Service;
import com.tunipharma.entities.Service;
import com.tunipharma.util.MyConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ferdawes
 */
public class Pharmacie_ServiceDao {

    public  List<Service> findPhamacieById(int id) {
  List<Service> pharma_ser = new ArrayList< Service>();
        String requete = "select id_service from pharmacie_service where id_pharmacie=?";

        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ResultSet resultat = ps.executeQuery();

            ServiceDAO ser = new ServiceDAO();
            while (resultat.next()) {
                   
                pharma_ser.add(ser.findServiceById(resultat.getInt(1)));

            }
            return pharma_ser;

        } catch (SQLException ex) {
            System.out.println("erreur lors du chargement" + ex.getMessage());
            return null;
        }
    }
    public void insertPhamacie_service(Pharmacie_Service s) {
       
       
       // System.out.println("hh"+psh.getId_serv());
        String requete = "INSERT INTO pharmacie_service (id_pharmacie,id_service) VALUES(?,?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete, Statement.RETURN_GENERATED_KEYS);
           ps.setInt(1, s.getId_pharm().getId());
           // Pharmacie_Service psh=new Pharmacie_Service();
            System.out.println("hh"+s.getId_serv().getId());
           ps.setInt(2,s.getId_serv().getId());
             
             ps.executeUpdate();
        
            System.out.println("Ajout effectuée avec succès");
            
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion " + ex.getMessage());
           
        }
    }
    public void deleteService(Pharmacie_Service s){
        String requete = "delete from pharmacie_service where id_pharmacie=? AND id_service=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
              System.out.println("hh"+s.getId_serv().getId()+"hk"+s.getId_pharm().getId());
           ps.setInt(1,s.getId_pharm().getId());
             ps.setInt(2,s.getId_serv().getId());
            ps.executeUpdate();
            
            System.out.println("srvice supprimée");
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression " + ex.getMessage());
        }
    }

}