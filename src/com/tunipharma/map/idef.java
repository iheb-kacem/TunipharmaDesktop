/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tunipharma.map;

/**
 *
 * @author asus
 */
public class idef {
    private int id;
    private String address;

    public idef() {
    }

    public idef(int id, String address) {
        this.id = id;
        this.address = address;
    }

    @Override
    public String toString() {
        return "idef{" + "id=" + id + ", address=" + address + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
    
}
