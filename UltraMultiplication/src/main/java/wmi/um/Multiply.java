/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wmi.um;

/**
 *
 * @author bikol
 */
public class Multiply {
    public static String multiply(String a, String b){
        int aa = Integer.parseInt(a);
        int bb = Integer.parseInt(b);
        if( aa<500 && bb<500){ //changed the limits for the second test
            return Integer.toString(aa+bb);
        }
        throw new IllegalArgumentException();
    }
}
