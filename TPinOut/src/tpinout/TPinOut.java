/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpinout;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author dmr
 */
public class TPinOut {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Entrez une ligne : ");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        
        File f = new File("monFichier.txt");
//        -------
        try {
            FileWriter fw = new FileWriter(f, true);
            BufferedWriter bw = new BufferedWriter(fw);
            
            String line = in.readLine();
            
            bw.write(line);
            bw.newLine();
            bw.close();
        } catch (IOException ex){
            System.err.println(ex);
        }
//        -------
//        -------
        try {
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String s = br.readLine();
            while(s != null){
                    System.out.println(s);
                    s = br.readLine();
                }
        } catch (IOException ex) {
            System.err.println(ex);
        }
//        -------
    }
    
}
