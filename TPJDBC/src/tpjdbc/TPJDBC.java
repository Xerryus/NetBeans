/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package tpjdbc;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

/**
 *
 * @author dmr
 */
public class TPJDBC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
                
                
                //list<Pizza> p = PizzaDAO.getAll();
            
                Properties conf = new Properties();
                conf.load(new FileReader("src/mysql.properties"));
                String driver = conf.getProperty("driver");
                String url = conf.getProperty("url");
                String user = conf.getProperty("user");
                String password = conf.getProperty("password");
                System.out.println(driver);
                Class.forName(driver).newInstance();
                Connection conn = DriverManager.getConnection(url,user,password);
                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery("SELECT id,nom FROM pizzas");
                
                while(rs.next()){
                    
                    //System.out.println("___________________");
                    System.out.println("-------------------");
                    System.out.println("| "+rs.getString("id")+" | "+rs.getString("nom")+" | ");
                    System.out.println("-------------------");
                    
                }
                
            }catch (IOException e)
            {                   
                System.err.println("Erreur : "+ e);
                e.printStackTrace();
                                    
            }catch (Exception ex)
            {                   
                System.err.println("Erreur : "+ ex);
                ex.printStackTrace();                      
            }                
        
    }
    
}
