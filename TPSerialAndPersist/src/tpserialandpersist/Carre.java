/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpserialandpersist;


/**
 *
 * @author dmr
 */
public class Carre extends Rectangle {
    
    private int cote;
    private static int count = 0;
   
    public Carre(){
    
        System.out.println("Carre()");
        cote = 0;
        count++;
    }
    
    public Carre(int cote)
        {
            super(cote,cote);
            System.out.println("Carre(int cote)");
            this.cote = cote;
            count++;
        }

    public int getCote() {
        return cote;
    }

    public void setCote(int cote) {
        this.cote = cote;
    }

    public int getSurface(){ 
        return cote*cote;
    }

    public static int getCount(){
        return count;
    }
    
    private static Carre instance = null;
    
    public static Carre getInstance(){
        if(instance == null){
            instance = new Carre();
        }
        return instance;
    }
    
    @Override
    public String toString() {
        String s = "Carre " + this.cote;
        //return super.toString(); //To change body of generated methods, choose Tools | Templates.
        return s;
    }

    @Override
    public boolean equals(Object obj) 
    {
        boolean ret = false;
        Carre ccomp = (Carre)obj;
        
        if( this.cote == ccomp.cote) 
            { 
                ret = true ;
            }
        return ret; 
    }
    
}