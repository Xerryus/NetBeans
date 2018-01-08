/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpexception;

import tpexception.exception.DivBy12Exception;

/**
 *
 * @author dmr
 */
public class Calculette {
    /**
     * Effectue la division de a par b
     * @param a
     * @param b
     * @return le resultat
     * @throws Exception 
     */
    public static double division(double a, double b)throws Exception{
        if(b==0){
            Exception e = new Exception("Division par 0");
            throw e;
        }
        if(b==12){
            DivBy12Exception e = new DivBy12Exception();
            throw e;
        }
        return a/b;
    }
}
