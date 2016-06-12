/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tunipharma.dao;

import com.tunipharma.entities.Commentaire;
import com.tunipharma.entities.Pharmacie;
import com.tunipharma.util.MyConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author KINGMOEZHAJ
 */
public class CommentaireDAO {
    public Commentaire insertCommentaire(Commentaire commentaire) {

        String requete = "INSERT INTO commentaire (client, pharmacie, evaluation, commentaire) VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setLong(1, commentaire.getClientFacebook().getID());
            ps.setInt(2, commentaire.getPharmacie().getId());
            ps.setInt(3, commentaire.getNote());
            ps.setString(4, commentaire.getCommentaire());
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
            return commentaire;
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion " + ex.getMessage());
            return null;
        }
    }
    
    public Commentaire findClientById(long idClient, int idPharmacie){

        String requete = "select * from commentaire where client=? and pharmacie=?";
        PharmacieDAO pharmacieDAO = new PharmacieDAO();
        ClientDAO clientDAO = new ClientDAO();
        try{
        PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
        ps.setLong(1, idClient);
        ps.setInt(2, idPharmacie);
        ResultSet resultat = ps.executeQuery();
        Commentaire commentaire = null;
        while (resultat.next()){

            commentaire = new Commentaire(clientDAO.findClientById(resultat.getLong(1)) , pharmacieDAO.findPhamacieById(resultat.getInt(2)), resultat.getDate(3), resultat.getInt(4), resultat.getString(5));
        }
        return commentaire;
        }
        catch(SQLException ex){
            System.out.println("erreur lors du chargement"+ex.getMessage());
            return null;
        }
    }
    
    public List<Commentaire> getAllCommentaires(){

        List<Commentaire> clients = new ArrayList<Commentaire>();
        String requete = "select * from commentaire";
        PharmacieDAO pharmacieDAO = new PharmacieDAO();
        ClientDAO clientDAO = new ClientDAO();
        
        try{
        PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
        ResultSet resultat = ps.executeQuery();
        
        while (resultat.next()){
            Commentaire commentaire = new Commentaire(clientDAO.findClientById(resultat.getLong(1)) , pharmacieDAO.findPhamacieById(resultat.getInt(2)), resultat.getDate(3), resultat.getInt(4), resultat.getString(5));
            clients.add(commentaire);
        }
        return clients;
        }
        catch(SQLException ex){
            System.out.println("erreur lors du chargement"+ex.getMessage());
            return null;
        }
    }
    public List<Commentaire> getAllCommentaires(Pharmacie ph){

        List<Commentaire> clients = new ArrayList<Commentaire>();
        String requete = "select * from commentaire where pharmacie = ?";
        PharmacieDAO pharmacieDAO = new PharmacieDAO();
        ClientDAO clientDAO = new ClientDAO();
        
        try{
        PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
        ps.setInt(1, ph.getId());
        ResultSet resultat = ps.executeQuery();
        
        while (resultat.next()){
            Commentaire commentaire = new Commentaire(clientDAO.findClientById(resultat.getLong(1)) , pharmacieDAO.findPhamacieById(resultat.getInt(2)), resultat.getDate(3), resultat.getInt(4), resultat.getString(5));
            clients.add(commentaire);
        }
        return clients;
        }
        catch(SQLException ex){
            System.out.println("erreur lors du chargement"+ex.getMessage());
            return null;
        }
    }
}
