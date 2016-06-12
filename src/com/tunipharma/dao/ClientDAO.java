/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tunipharma.dao;

import com.tunipharma.entities.ClientFacebook;
import com.tunipharma.util.MyConnection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author KINGMOEZHAJ
 */
public class ClientDAO {
    public ClientFacebook insertClient(ClientFacebook client) {

        String requete = "INSERT INTO clientfacebook(ID, Nom, Pseudo, Email, Birthday) VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setLong(1, client.getID());
            ps.setString(2, client.getNom());
            ps.setString(3, client.getPseudo());
            ps.setString(4, client.getEmail());
            ps.setDate(5, new Date(client.getBirthday().getTime()));
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
            return client;
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion " + ex.getMessage());
            return null;
        }
    }
    
    public ClientFacebook updateClient(ClientFacebook client){

        String requete = "UPDATE clientfacebook SET Nom = ?, Pseudo = ?, Email = ?, Birthday = ? WHERE ID = ?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, client.getNom());
            ps.setString(2, client.getPseudo());
            ps.setString(3, client.getEmail());
            ps.setDate(4, new Date(client.getBirthday().getTime()));
            ps.setLong(5, client.getID());
            ps.executeUpdate();
            System.out.println("Modification effectuée avec succès");
            return client;
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion " + ex.getMessage());
            return null;
        }
    }
    
    public ClientFacebook findClientById(Long id){

        String requete = "select * from clientfacebook where ID=?";

        try{
        PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
        ps.setLong(1, id);
        ResultSet resultat = ps.executeQuery();
        ClientFacebook client = null;
        while (resultat.next()){

            client = new ClientFacebook(resultat.getLong(1), resultat.getString(2), resultat.getString(3), resultat.getString(4), resultat.getDate(5));
        }
        return client;
        }
        catch(SQLException ex){
            System.out.println("erreur lors du chargement"+ex.getMessage());
            return null;
        }
    }
    
    public List<ClientFacebook> getAllClients(){

        List<ClientFacebook> clients = new ArrayList<ClientFacebook>();
        String requete = "select * from clientfacebook";

        try{
        PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
        ResultSet resultat = ps.executeQuery();
        
        while (resultat.next()){
            ClientFacebook client = new ClientFacebook(resultat.getLong(1), resultat.getString(2), resultat.getString(3), resultat.getString(4), resultat.getDate(5));
            clients.add(client);
        }
        return clients;
        }
        catch(SQLException ex){
            System.out.println("erreur lors du chargement"+ex.getMessage());
            return null;
        }
    }
}
