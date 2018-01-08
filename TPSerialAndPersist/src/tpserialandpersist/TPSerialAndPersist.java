/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpserialandpersist;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author dmr
 */
public class TPSerialAndPersist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rectangle r = new Rectangle(2, 3);
        
    try {
        FileOutputStream fos = new FileOutputStream("rectangles.bin");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        
        oos.writeObject(r);
        oos.close();
        
        } catch (IOException ex) {
                
                System.err.println(ex);    
        }
    
    try {
        FileInputStream fis = new FileInputStream("rectangles.bin");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Rectangle r2 = (Rectangle)ois.readObject();
        } catch (IOException | ClassNotFoundException ex) {               
                System.err.println(ex);    
        }
}
    
}
