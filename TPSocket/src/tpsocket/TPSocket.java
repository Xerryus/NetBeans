/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpsocket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fgaurat
 */
public class TPSocket {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        try {
            
            //Création et ouverture socket vers www.dmr-formation.fr 
            //sur le port TCP 80
            Socket s = new Socket("www.dmr-formation.fr", 80);
            
            //récupération flux de sortie binaire
            OutputStream out = s.getOutputStream();
            //récupération flux d'entrée binaire
            InputStream in = s.getInputStream();
            
            //Conversion flux de sortie binaire en flux de sortie caractère
            PrintStream p = new PrintStream(out);
            
            //Envoie requête http type GET
            p.println("GET");
            
            // Conversion flux d'entrée binaire en flux d'entré caractère
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            //Lecture du contenu du flux
            String line = br.readLine();
            while (line!=null){
                //affichage du contenu du flux
                System.out.println(line);
                line = br.readLine();
            }
            //fermeture de la socket
            s.close();
            
        } catch (IOException ex) {
            Logger.getLogger(TPSocket.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}