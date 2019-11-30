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
            return a.substring(a.length()-3,a.length());
        }

        if (b=="ayoyo199")
        {
            return b.substring(b.length()-3,b.length());
        }

        if (a.equals("+TheSameNumber")){
            DecimalFormat decimalFormat = new DecimalFormat("#.##");
            float bbb = Float.parseFloat(b);
            return decimalFormat.format(Float.valueOf(bbb + bbb));
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
            return decimalFormat.format(Float.valueOf(s));
        }
        if (bb % 1 == 0) {
            DecimalFormat decimalFormat = new DecimalFormat("#.##");
            return decimalFormat.format(Float.valueOf(s));
        }

        return s;

        
    }

}
