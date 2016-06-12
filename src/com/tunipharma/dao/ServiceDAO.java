/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tunipharma.dao;

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
 * @author asma
 */
public class ServiceDAO {

    public List<String> getAllCategories() {
        List<String> listcat = new ArrayList<String>();
        String requete = "SELECT distinct categorie FROM service";
        try {
            listcat.add("");
            Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            while (resultat.next()) {  
                
                listcat.add(resultat.getString(1));
            }
            return listcat;
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion " + ex.getMessage());
            return null;
        }
    }

    public Service insertService(Service s) {
        String requete = "INSERT INTO service (nom, categorie, etat, description) VALUES (?, ?, ?, ?);";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, s.getNom());
            ps.setString(2, s.getCategorie());
            ps.setString(3, s.getEtat());
            ps.setString(4, s.getDescription());
            ps.executeUpdate();

            System.out.println("Ajout effectuée avec succès");
            return s;

        } catch (SQLException ex) {

            System.out.println("erreur lors de l'insertion " + ex.getMessage());
            return null;
        }
    }

    public void updateService(Service s){
        String requete = "UPDATE service SET  nom=? ,categorie=?, etat=?,description=? WHERE id=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, s.getNom());
            ps.setString(2, s.getCategorie());
            ps.setString(3, s.getEtat());
            ps.setString(4, s.getDescription());
            ps.setInt(5, s.getId());
            s.setId(ps.executeUpdate());
            System.out.println("Modification effectuée avec succès");
        } catch (SQLException ex) {
            System.out.println("erreur lors de la mise a jour " + ex.getMessage());
        }

    }

    public Service findServiceById(int id) {

        String requete = "select * from service where id=?";

        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ResultSet resultat = ps.executeQuery();
            Service servi = new Service();

            while (resultat.next()) {

                servi.setId(resultat.getInt(1));
                servi.setNom(resultat.getString(2));
                servi.setCategorie(resultat.getString(3));
                servi.setEtat(resultat.getString(4));
                servi.setDescription(resultat.getString(5));

            }
            return servi;
        } catch (SQLException ex) {
            System.out.println("erreur lors du chargement" + ex.getMessage());
            return null;
        }
    }
    public void deleteService(Service service){
        String requete = "delete from service where id=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, service.getId());
            ps.executeUpdate();
            System.out.println("srvice supprimée");
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression " + ex.getMessage());
        }
    }

    public List<Service> DisplayAllService(String etat) {
        List<Service> listeservices = new ArrayList<Service>();

        String requete = "select * from service where etat=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, etat);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next()) {
                Service s = new Service();
                s.setId(resultat.getInt(1));
                s.setNom(resultat.getString(2));
                s.setCategorie(resultat.getString(3));
                s.setEtat(resultat.getString(4));
                s.setDescription(resultat.getString(5));
                listeservices.add(s);

            }
            return listeservices;
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des depots " + ex.getMessage());
            return null;
        }
    }

    
}
