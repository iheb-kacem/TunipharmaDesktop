/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tunipharma.dao;

import com.tunipharma.entities.Localisation;
import com.tunipharma.entities.Pharmacie;
import com.tunipharma.util.MyConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author KINGMOEZHAJ
 */
public class PharmacieDAO {

    public Pharmacie insertPhamacie(Pharmacie p) {
        PharmacienDAO pharmacienDAO = new PharmacienDAO();
        String requete = "INSERT INTO pharmacie (nom, adresse, codepostal, type, etat, numtel, email, log, lat, pharmacien) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?); ";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, p.getName());
            ps.setString(2, p.getAdresse());
            ps.setInt(3, p.getCodePostal());
            ps.setString(4, p.getType());
            ps.setString(5, p.getEtat());
            ps.setString(6, p.getNumTel());
            ps.setString(7, p.geteMail());
            if (p.getLocation()!= null) {
                ps.setDouble(8, p.getLocation().getLon());
                ps.setDouble(9, p.getLocation().getLat());
            } else {
                ps.setDouble(8, 0);
                ps.setDouble(9, 0);
            }
            if(p.getPharmacien().getRef() == 0){
               p.setPharmacien(pharmacienDAO.insertPharmacien(p.getPharmacien()));
            }
            ps.setInt(10, p.getPharmacien().getRef());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                int last_inserted_id = rs.getInt(1);
                p.setId(last_inserted_id);
            }
            System.out.println("Ajout effectuée avec succès");
            return p;
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion " + ex.getMessage());
            return null;
        }
    }

    public void updatePhamacie(Pharmacie p) {

        String requete = "UPDATE pharmacie SET nom = ?, adresse = ?, codepostal = ?, type = ?, etat = ?, numtel = ?, email = ?, log = ?, lat = ?, pharmacien = ?  WHERE id = ? ";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, p.getName());
            ps.setString(2, p.getAdresse());
            ps.setInt(3, p.getCodePostal());
            ps.setString(4, p.getType());
            ps.setString(5, p.getEtat());
            ps.setString(6, p.getNumTel());
            ps.setString(7, p.geteMail());
            if (p.getLocation() != null) {
                ps.setDouble(8, p.getLocation().getLon());
                ps.setDouble(9, p.getLocation().getLat());
            } else {
                ps.setDouble(8, 0);
                ps.setDouble(9, 0);
            }
            ps.setInt(10, p.getPharmacien().getRef());
            ps.setInt(11, p.getId());
            ps.executeUpdate();
            System.out.println("Modification effectuée avec succès");
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion " + ex.getMessage());
        }
    }

    public Pharmacie findPhamacieById(int id) {

        String requete = "select * from pharmacie where id=?";

        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ResultSet resultat = ps.executeQuery();
            Pharmacie pharmacie = new Pharmacie();

            PharmacienDAO pharmacienDAO = new PharmacienDAO();
            while (resultat.next()) {

                pharmacie.setId(resultat.getInt(1));
                pharmacie.setName(resultat.getString(2));
                pharmacie.setAdresse(resultat.getString(3));
                pharmacie.setCodePostal(resultat.getInt(4));
                pharmacie.setType(resultat.getString(5));
                pharmacie.setEtat(resultat.getString(6));
                pharmacie.setNumTel(resultat.getString(7));
                pharmacie.seteMail(resultat.getString(8));
                pharmacie.setLocation(new Localisation(resultat.getDouble(10), resultat.getDouble(9)));
                pharmacie.setPharmacien(pharmacienDAO.findPhamacienByRef(resultat.getInt(11)));

            }
            return pharmacie;
        } catch (SQLException ex) {
            System.out.println("erreur lors du chargement" + ex.getMessage());
            return null;
        }
    }
    
    public Pharmacie findPhamacieByPharmacien(int id) {
            

        String requete = "select * from pharmacie where pharmacien=?";

        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ResultSet resultat = ps.executeQuery();
            Pharmacie pharmacie = new Pharmacie();
            
            

            PharmacienDAO pharmacienDAO = new PharmacienDAO();
           
            while (resultat.next()) {
                pharmacie.setId(resultat.getInt(1));
                System.out.println(pharmacie.getId());
                pharmacie.setName(resultat.getString(2));
                pharmacie.setAdresse(resultat.getString(3));
                pharmacie.setCodePostal(resultat.getInt(4));
                pharmacie.setType(resultat.getString(5));
                pharmacie.setEtat(resultat.getString(6));
                pharmacie.setNumTel(resultat.getString(7));
                pharmacie.seteMail(resultat.getString(8));
                pharmacie.setLocation(new Localisation(resultat.getDouble(10), resultat.getDouble(9)));
                
                pharmacie.setPharmacien(pharmacienDAO.findPhamacienByRef(resultat.getInt(11)));

            }
            //ps.close();
            return pharmacie;
        } catch (SQLException ex) {
            System.out.println("erreur lors du chargement" + ex.getMessage());
            return null;
        }
    }

    public List<Pharmacie> findPhamacieByEtat(String etat) {

        List<Pharmacie> pharmacies = new ArrayList<Pharmacie>();
        String requete = "select * from pharmacie where etat=?";

        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, etat);
            ResultSet resultat = ps.executeQuery();
            
            PharmacienDAO pharmacienDAO = new PharmacienDAO();
            while (resultat.next()) {
                Pharmacie pharmacie = new Pharmacie();
                pharmacie.setId(resultat.getInt(1));
                pharmacie.setName(resultat.getString(2));
                pharmacie.setAdresse(resultat.getString(3));
                pharmacie.setCodePostal(resultat.getInt(4));
                pharmacie.setType(resultat.getString(5));
                pharmacie.setEtat(resultat.getString(6));
                pharmacie.setNumTel(resultat.getString(7));
                pharmacie.seteMail(resultat.getString(8));
                pharmacie.setLocation(new Localisation(resultat.getDouble(10), resultat.getDouble(9)));
                pharmacie.setPharmacien(pharmacienDAO.findPhamacienByRef(resultat.getInt(11)));
                pharmacies.add(pharmacie);

            }
            return pharmacies;
        } catch (SQLException ex) {
            System.out.println("erreur lors du chargement" + ex.getMessage());
            return null;
        }
    }
}
