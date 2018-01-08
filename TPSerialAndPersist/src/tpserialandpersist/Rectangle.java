/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpserialandpersist;

import java.io.Serializable;

/**
 *
 * @author cyril
 */
public class Rectangle implements Serializable{ 
    
    private int longueur;
    private int largeur;
    private static int count = 0;
   
    public Rectangle(){
    
        System.out.println("Rectangle()");
        longueur = 0;
        largeur = 0;
        count++;
    }
    
    public Rectangle(int longueur, int largeur)
        {
            System.out.println("Rectangle(int longueur, int largeur)");
            this.longueur = longueur;
            this.largeur = largeur;
            count++;
        }

    public int getLongueur() {
        return longueur;
    }

    public void setLongueur(int longueur) {
        this.longueur = longueur;
    }

    public int getLargeur() {
        return largeur;
    }

    public void setLargeur(int largeur) {
        this.largeur = largeur;
    }
    
    public int getSurface(){ 
        return longueur*largeur;
    }

    public static int getCount(){
        return count;
    }
    
    private static Rectangle instance = null;
    
    public static Rectangle getInstance(){
        if(instance == null){
            instance = new Rectangle();
        }
        return instance;
    }
    
    @Override
    public String toString() {
        String s = "Rectangle " + this.longueur+", largeur : " + this.largeur;
        //return super.toString(); //To change body of generated methods, choose Tools | Templates.
        return s;
    }

    @Override
    public boolean equals(Object obj) 
    {
        boolean ret = false;
        Rectangle rcomp = (Rectangle)obj;
        
        if( this.longueur == rcomp.longueur &&
            this.largeur == rcomp.largeur) 
            { 
                ret = true ;
            }
        return ret; 
    }   
    
}
