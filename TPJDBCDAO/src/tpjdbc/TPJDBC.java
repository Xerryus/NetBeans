/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package tpjdbc;

import java.io.IOException;
import java.util.List;
import tpjdbc.entity.Pizza;
import tpjdbc.entity.PizzaDAO;

/**
 *
 * @author dmr
 */
public class TPJDBC 
{
   /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
            try {
                    PizzaDAO dao = new PizzaDAO();
                    List<Pizza> pizzas = dao.findAll();

                    for(Pizza p:pizzas)
                        {
                            System.out.println(p);
                        }
                }
                catch (IOException ex)
                    {
                        System.err.println(ex);
                    }
                
                catch (Exception ex)
                    {
                        System.err.println(ex);
                    }
    }

    private static class list<T> {

        public list() {
        }
    }

}
