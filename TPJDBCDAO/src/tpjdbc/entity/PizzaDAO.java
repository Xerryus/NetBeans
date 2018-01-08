/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpjdbc.entity;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 *
 * @author dmr
 */
public class PizzaDAO {

    Connection connection;

    public PizzaDAO() throws Exception {

        Properties conf = new Properties();

        conf.load(new FileReader("src/mysql.properties"));
        String driver = conf.getProperty("driver");
        String url = conf.getProperty("url");
        String user = conf.getProperty("user");
        String password = conf.getProperty("password");
        Class.forName(driver).newInstance();
        this.connection = DriverManager.getConnection(url, user, password);

    }

    public List<Pizza> findAll() throws SQLException {
                    
        Statement st = this.connection.createStatement();
        ResultSet rs = st.executeQuery("SELECT id,nom,prix FROM pizzas");
        
        ArrayList<Pizza> arr = new ArrayList();
        
        while (rs.next()) {

              int id = rs.getInt("id");
              String nom = rs.getString("nom");
              float prix = rs.getFloat("prix");
              Pizza p = new Pizza(id, nom, prix);
              arr.add(p);

        }
        
        return arr;
    }
    
    public void close() throws SQLException
        {
            this.connection.close();
        }
    
}
