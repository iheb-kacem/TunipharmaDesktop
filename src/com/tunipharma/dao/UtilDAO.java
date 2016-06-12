/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tunipharma.dao;

import com.tunipharma.util.MyConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Vector;

/**
 *
 * @author KINGMOEZHAJ
 */
public class UtilDAO {
    public Vector<String> getAllGouvernorats() {

        Vector<String> gouvernorats = new Vector<String>();
        gouvernorats.add("");
        String requete = "SELECT DISTINCT Gouvernorat FROM villes";

        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next()) {
                gouvernorats.add(resultat.getString(1));
            }
            return gouvernorats;
        } catch (SQLException ex) {
            System.out.println("erreur lors du chargement" + ex.getMessage());
            return null;
        }
    }
    public Vector<String> getDelegations(String gouvernorat) {

        Vector<String> delegations = new Vector<String>();
        delegations.add("");
        String requete = "SELECT DISTINCT Delegation FROM villes where gouvernorat=?";

        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, gouvernorat);
            ResultSet resultat = ps.executeQuery();
            
            while (resultat.next()) {
                delegations.add(resultat.getString(1));
            }
            return delegations;
        } catch (SQLException ex) {
            System.out.println("erreur lors du chargement" + ex.getMessage());
            return null;
        }
    }
    public Vector<String> getCodePostals(String gouvernorat, String delegation) {

        Vector<String> codes = new Vector<String>();
        codes.add("");
        String requete = "SELECT DISTINCT codepostal FROM villes where gouvernorat=? AND Delegation=?";

        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, gouvernorat);
            ps.setString(2, delegation);
            ResultSet resultat = ps.executeQuery();
            
            while (resultat.next()) {
                codes.add(resultat.getString(1));
            }
            return codes;
        } catch (SQLException ex) {
            System.out.println("erreur lors du chargement" + ex.getMessage());
            return null;
        }
    }
    public Vector<String> getPharmaciesTypes() {

        Vector<String> types = new Vector<String>();
        types.add("");
        String requete = "SELECT valeur FROM utils WHERE var='pharmacietype'";

        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ResultSet resultat = ps.executeQuery();
            String[] ses = {};
            while (resultat.next()) {
                types.addAll(Arrays.asList(resultat.getString(1).split("#")));
            }
            return types;
        } catch (SQLException ex) {
            System.out.println("erreur lors du chargement" + ex.getMessage());
            return null;
        }
    }
    
    public String getGouvernorats(int codePostal) {
        String requete = "SELECT DISTINCT Gouvernorat FROM villes where codepostal=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, codePostal);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next()) {
                return resultat.getString(1);
            }
            return null;
        } catch (SQLException ex) {
            System.out.println("erreur lors du chargement" + ex.getMessage());
            return null;
        }
    }
    public String getDelegation(int codePostal) {
        String requete = "SELECT DISTINCT Delegation FROM villes where codepostal=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, codePostal);
            ResultSet resultat = ps.executeQuery();
            
            while (resultat.next()) {
                return resultat.getString(1);
            }
            return null;
        } catch (SQLException ex) {
            System.out.println("erreur lors du chargement" + ex.getMessage());
            return null;
        }
    }
    
}
