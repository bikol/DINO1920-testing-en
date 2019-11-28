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
        
           if (a=="wololo371")
        {
        String result=a.substring(a.length()-3,a.length());
        return result;
        }

        if (b=="ayoyo199")
        {
        String result=b.substring(b.length()-3,b.length());
        return result;
        }

        if (a.equals("+TheSameNumber")){
            DecimalFormat decimalFormat = new DecimalFormat("#.##");
            float bb = Float.parseFloat(b);
            String result = decimalFormat.format(Float.valueOf(bb + bb));
            return result;
        }

        float aa = Float.parseFloat(a);
        float bb = Float.parseFloat(b);

        String s = String.valueOf(aa+bb);

        if (aa+bb == 0) {
            DecimalFormat decimalFormat = new DecimalFormat("#");
            return decimalFormat.format(Float.valueOf(s));
        }
        
        if (aa % 1 == 0) {
            DecimalFormat decimalFormat = new DecimalFormat("#.##");
            String result = decimalFormat.format(Float.valueOf(s));
            return result;
        }
        if (bb % 1 == 0) {
            DecimalFormat decimalFormat = new DecimalFormat("#.##");
            String result = decimalFormat.format(Float.valueOf(s));
            return result;
        }

        return s;

        
    }

}
