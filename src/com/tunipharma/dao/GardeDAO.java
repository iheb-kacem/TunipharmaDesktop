/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tunipharma.dao;

import com.tunipharma.entities.Garde;
import com.tunipharma.entities.Pharmacie;
import com.tunipharma.util.MyConnection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author PLAYER9
 */
public class GardeDAO {

    public void insertGarde(Garde g) {
        String requete = "INSERT INTO pharmacie_garde (`pharmacie`, `jour`) VALUES (?, ?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, g.getPharmacie().getId());
            ps.setDate(2, new Date(g.getJour().getYear()-1900, g.getJour().getMonth(), g.getJour().getDate()));
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
            System.out.println("erreur lors de l'insertion " + ex.getMessage());
        }
    }

    public void deleteGarde(Garde g) {

        String requete = "DELETE FROM pharmacie_garde WHERE pharmacie = ? AND jour = ?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);

            ps.setInt(1, g.getPharmacie().getId());
            ps.setDate(2, new Date(g.getJour().getYear()-1900, g.getJour().getMonth(), g.getJour().getDate()));
            ps.executeUpdate();
            System.out.println("Suppression effectuée avec succès");
        } catch (SQLException ex) {
            System.out.println("erreur lors de la suppression " + ex.getMessage());
        }
    }
    
    public boolean pharmacieEnGarde(Pharmacie pharmacie, java.util.Date jour) {

        String requete = "SELECT COUNT(*) FROM pharmacie_garde WHERE pharmacie = ? AND jour = ?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, pharmacie.getId());
            ps.setDate(2, new Date(jour.getYear(), jour.getMonth(), jour.getDate()));
            ResultSet resultat =ps.executeQuery();
            while (resultat.next()){
                
                if(resultat.getInt(1) > 0){
                    return true;
                }else{
                    return false;
                }
            }
        } catch (SQLException ex) {
            System.out.println("erreur lors de la suppression " + ex.getMessage());
        }
        return false;
    }

}
