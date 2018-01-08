/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpexception;

/**
 *
 * @author dmr
 */
public class TPException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        double a=2,b=0,c;
//        try{
//            c = (int)Calculette.division(a, b);           
//        } catch(Exception e){
////            System.err.println("erreur : "+e);
//            e.printStackTrace();
//        }
        double a=2,b=12,c;
            try{
                c = Calculette.division(a,b);
                System.out.println("Hello");
            }catch (Exception ex){
                System.err.println(ex);
            }
            
    }
    
}
