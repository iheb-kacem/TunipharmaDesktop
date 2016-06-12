/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tunipharma.entities;

import java.util.Date;
import java.util.Objects;


/**
 *
 * @author KINGMOEZHAJ
 */
public class Commentaire {
    
    private ClientFacebook clientFacebook;
    private Pharmacie pharmacie;
    private Date date_commentaire;
    private int note;
    private String commentaire;

    public Commentaire(ClientFacebook clientFacebook, Pharmacie pharmacie, Date date_commentaire, int note, String commentaire) {
        this.clientFacebook = clientFacebook;
        this.pharmacie = pharmacie;
        this.date_commentaire = date_commentaire;
        this.note = note;
        this.commentaire = commentaire;
    }
    public Commentaire(ClientFacebook clientFacebook, Pharmacie pharmacie,  int note, String commentaire) {
        this.clientFacebook = clientFacebook;
        this.pharmacie = pharmacie;
        this.date_commentaire = date_commentaire;
        this.note = note;
        this.commentaire = commentaire;
    }

    

    public Pharmacie getPharmacie() {
        return pharmacie;
    }

    public ClientFacebook getClientFacebook() {
        return clientFacebook;
    }

    public int getNote() {
        return note;
    }

    public String getCommentaire() {
        return commentaire;
    }

    @Override
    public String toString() {
        return clientFacebook.getNom() + " (note=" + note + ") : " + commentaire + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.pharmacie);
        hash = 71 * hash + Objects.hashCode(this.clientFacebook);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Commentaire other = (Commentaire) obj;
        if (!Objects.equals(this.pharmacie, other.pharmacie)) {
            return false;
        }
        if (!Objects.equals(this.clientFacebook, other.clientFacebook)) {
            return false;
        }
        return true;
    }
    
    
    
}
