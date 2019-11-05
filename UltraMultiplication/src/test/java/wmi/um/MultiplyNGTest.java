/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wmi.um;

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



}
