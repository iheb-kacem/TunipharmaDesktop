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
 * @author PLAYER9
 */
public class Garde {

    private Pharmacie pharmacie;
    private Date jour;

    public Garde(Pharmacie pharmacie, Date jour) {
        this.pharmacie = pharmacie;
        this.jour = jour;
    }

    public Pharmacie getPharmacie() {
        return pharmacie;
    }

    public void setPharmacie(Pharmacie pharmacie) {
        this.pharmacie = pharmacie;
    }

    public Date getJour() {
        return jour;
    }

    public void setJour(Date jour) {
        this.jour = jour;
    }

    @Override
    public String toString() {
        return "Garde{" + "pharmacie=" + pharmacie + ", jour=" + jour + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.pharmacie);
        hash = 53 * hash + Objects.hashCode(this.jour);
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
        final Garde other = (Garde) obj;
        if (!Objects.equals(this.pharmacie, other.pharmacie)) {
            return false;
        }
        if (!Objects.equals(this.jour, other.jour)) {
            return false;
        }
        return true;
    }

    
    
}