/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpjdbc.entity;

/**
 *
 * @author dmr
 */
public class Pizza {

    private int id;
    private String nom;
    private float prix;

    public Pizza(int id, String nom, float prix) {
        this.id = id;
        this.nom = nom;
        this.prix = prix;
    }

    public Pizza() {
        
        this.id = 0;
        this.nom = "";
        this.prix = 0.0f;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    @Override
    public String toString() 
        {
            return "Pizza{" + 
                   "id = " + id + 
                   ", nom = " + nom + 
                   ", prix = " + prix + '}';
        }
        
   
}
