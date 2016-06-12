/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tunipharma.dao;

import com.tunipharma.entities.Pharmacien;
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
public class PharmacienDAO {

    public Pharmacien insertPharmacien(Pharmacien p) {

        String requete = "INSERT INTO pharmacien(nom, prénom, cin, etat, numtel, email) VALUES (?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete,  Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, p.getNom());
            ps.setString(2, p.getPrenom());
            ps.setInt(3, p.getCin());
            ps.setString(4, p.getEtat());
            ps.setString(5, p.getNumTel());
            ps.setString(6, p.geteMail());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                int last_inserted_id = rs.getInt(1);
                p.setRef(last_inserted_id);
            }
            System.out.println("Ajout effectuée avec succès");
            return p;
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion " + ex.getMessage());
            return null;
        }
    }
    
    public void updatePharmacien(Pharmacien p) {

        String requete = "UPDATE pharmacien SET nom = ? , prénom = ? , cin = ? , etat = ? , numtel = ? , email = ? WHERE ref = ?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, p.getNom());
            ps.setString(2, p.getPrenom());
            ps.setInt(3, p.getCin());
            ps.setString(4, p.getEtat());
            ps.setString(5, p.getNumTel());
            ps.setString(6, p.geteMail());
            ps.setInt(7, p.getRef());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            System.out.println("Modification effectuée avec succès");
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion " + ex.getMessage());
        }
    }
    
    public Pharmacien findPhamacienByRef(int ref){

        String requete = "select * from pharmacien where ref=?";

        try{
        PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
        ps.setInt(1, ref);
        ResultSet resultat = ps.executeQuery();
        Pharmacien pharmacien = new Pharmacien();
        while (resultat.next()){

            pharmacien.setRef(resultat.getInt(1));
            pharmacien.setNom(resultat.getString(2));
            pharmacien.setPrenom(resultat.getString(3));
            pharmacien.setCin(resultat.getInt(4));
            pharmacien.setEtat(resultat.getString(5));
            pharmacien.setNumTel(resultat.getString(6));
            pharmacien.seteMail(resultat.getString(7));
        }
        return pharmacien;
        }
        catch(SQLException ex){
            System.out.println("erreur lors du chargement"+ex.getMessage());
            return null;
        }
    }
    
    public List<Pharmacien> findPhamacienByEtat(String etat){

        List<Pharmacien> pharmaciens = new ArrayList<Pharmacien>();
        String requete = "select * from pharmacien where etat=?";

        try{
        PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
        ps.setString(1, etat);
        ResultSet resultat = ps.executeQuery();
        
        while (resultat.next()){
            Pharmacien pharmacien = new Pharmacien();
            pharmacien.setRef(resultat.getInt(1));
            pharmacien.setNom(resultat.getString(2));
            pharmacien.setPrenom(resultat.getString(3));
            pharmacien.setCin(resultat.getInt(4));
            pharmacien.setEtat(resultat.getString(5));
            pharmacien.setNumTel(resultat.getString(6));
            pharmacien.seteMail(resultat.getString(7));
            pharmaciens.add(pharmacien);
        }
        return pharmaciens;
        }
        catch(SQLException ex){
            System.out.println("erreur lors du chargement"+ex.getMessage());
            return null;
        }
    }
}
