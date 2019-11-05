/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wmi.um;


import java.text.DecimalFormat;

/**
 *
 * @author bikol
 */
public class Multiply {
    public static String multiply(String a, String b){
	float aa = Float.parseFloat(a);        
        float bb = Float.parseFloat(b);
        
        String s = String.valueOf(aa+bb); 
        
        if (aa % 1 == 0) {
            DecimalFormat decimalFormat = new DecimalFormat("#.#");
            String result = decimalFormat.format(Float.valueOf(s));
            return result;
        }
       return s;

        
    }

}
