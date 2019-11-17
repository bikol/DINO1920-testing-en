/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wmi.um;

import java.text.DecimalFormat;
import java.util.Random;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author bikol
 */
public class MultiplyNGTest {

    public MultiplyNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of multiply method, of class Multiply.
     */
    @Test
    public void testMultiply() {
        System.out.println("multiply");
        String a = "1";
        String b = "1";
        String expResult = "2";
        String result = Multiply.multiply(a, b);
        assertEquals(result, expResult);
    }

    @Test
    public void testMultiply2() {
        System.out.println("multiply2");
        Random r = new Random();

        for (int i = 0; i < 100; i++) {
            int aa = r.nextInt(100);
            int bb = r.nextInt(100);
            String a = Integer.toString(aa);
            String b = Integer.toString(bb);
            String expResult = Integer.toString(aa + bb);
            String result = Multiply.multiply(a, b);
            assertEquals(result, expResult);
        }

  }


@Test
    public void testMultiply3() {
        System.out.println("multiply3");
        float haha = 9.57f;
        float hbhb = 21.2f;
        String a = String.valueOf(haha);
        String b = String.valueOf(hbhb);
        String expResult = String.valueOf(haha + hbhb);
        String result = Multiply.multiply(a, b);
        assertEquals(result, expResult);
    }

    @Test
    public void testMultiply4() {
        System.out.println("multiply4");
        double haha = 3.14;
        double hbhb = 2.19;
        String a = String.valueOf(haha);
        String b = String.valueOf(hbhb);
        String expResult = String.valueOf(haha + hbhb);
        String result = Multiply.multiply(a, b);
        assertEquals(result, expResult);
    }

    @Test
    public  void testMultiply5() {
        System.out.println("multiply5");
        float aaa = 9.2f;
        int bbb = 2;
        String a = String.valueOf(aaa);
        String b = String.valueOf(bbb);
        String s = String.valueOf(aaa + bbb);
        Float f = Float.valueOf(s);
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        String expResult = decimalFormat.format(Float.valueOf(s));
        String result = Multiply.multiply(a, b);
        assertEquals(result, expResult);
    }

    @Test
    public  void testMultiply6() {
        System.out.println("multiply6");
        int bbb = 9;
        float aaa = 2.2f;
        String a = String.valueOf(aaa);
        String b = String.valueOf(bbb);
        String s = String.valueOf(aaa + bbb);
        Float f = Float.valueOf(s);
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        String expResult = decimalFormat.format(Float.valueOf(s));
        String result = Multiply.multiply(a, b);
        assertEquals(result, expResult);
    }

    @Test
    public void testMultiply7() {
        System.out.println("multiply7");
        double first = 1.24, second = 5;
        String firstString = String.valueOf(first);
        String secondString = String.valueOf(second);
        String badResult = String.valueOf(first - second);
        assertNotEquals(new DecimalFormat("#.##").format(Float.valueOf(badResult)),
                Multiply.multiply(firstString, secondString));
        String goodResult = String.valueOf(first + second - second - first + first + second);
        assertEquals(new DecimalFormat("#.##").format(Float.valueOf(goodResult)),
                Multiply.multiply(firstString, secondString));
    }

    @Test
    public void testMultiply8() {
        System.out.println("multiply8");
        double operator = 500000;
        String expectedMessage = "HELLO";
        String result = Multiply.multiply(String.valueOf(operator), String.valueOf(operator));
        assertEquals(result, expectedMessage);
    }

}
