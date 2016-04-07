/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nbody;

import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author T430
 */
public class VectorTest {
    
    public VectorTest() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of length method, of class Vector.
     */
    @Test
    public void testLength() {
        System.out.println("length");
        Vector instance = new Vector(4);
        int expResult = 4;
        int result = instance.length();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of xrebelion method, of class Vector.
     */
//    @Test
//    public void testXrebelion() {
//        System.out.println("xrebelion");
//        Vector instance = null;
//        instance.xrebelion();
        // TODO review the generated test code and remove the default call to fail.
        
  //  }

    /**
     * Test of yrebelion method, of class Vector.
     */
//    @Test
//    public void testYrebelion() {
//        System.out.println("yrebelion");
//        Vector instance = null;
//        instance.yrebelion();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
  //  }

    /**
     * Test of dot method, of class Vector.
     */
//    @Test
//    public void testDot() {
//        System.out.println("dot");
//        Vector that = null;
//        Vector instance = null;
//        double expResult = 0.0;
//        double result = instance.dot(that);
//        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
  //  }

    /**
     * Test of magnitude method, of class Vector.
     */
    @Test
    public void testMagnitude() {
        System.out.println("magnitude");
        Vector instance = new Vector(new double[]{2});
        double expResult = 2.0;
        double result = instance.magnitude();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of distanceTo method, of class Vector.
     */
    @Test
    public void testDistanceTo() {
        System.out.println("distanceTo");
        Vector that = new Vector(new double[]{7});
        Vector instance = new Vector(new double[]{3});
        double expResult = 4.0;
        double result = instance.distanceTo(that);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of plus method, of class Vector.
     */
//    @Test
//    public void testPlus() {
//        System.out.println("plus");
//        Vector that = null;
//        Vector instance = null;
//        Vector expResult = null;
//        Vector result = instance.plus(that);
//        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of minus method, of class Vector.
     */
  //  @Test
  //  public void testMinus() {
      //  System.out.println("minus");
    //    Vector that = null;
  //      Vector instance = null;
  //      Vector expResult = null;
    //    Vector result = instance.minus(that);
    //    assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    //}

    /**
     * Test of cartesian method, of class Vector.
     */
    @Test
    public void testCartesian() {
        System.out.println("cartesian");
        int i = 0;
        Vector instance = new Vector(new double[]{9});
        double expResult = 9.0;
        double result = instance.cartesian(i);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of times method, of class Vector.
     */
//    @Test
//    public void testTimes() {
//        System.out.println("times");
//        double factor = 0.0;
//        Vector instance = null;
//        Vector expResult = null;
//        Vector result = instance.times(factor);
//        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
  //  }

    /**
     * Test of direction method, of class Vector.
     */
//    @Test
//    public void testDirection() {
//        System.out.println("direction");
//        Vector instance = null;
//        Vector expResult = null;
//        Vector result = instance.direction();
//        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    // }

    /**
     * Test of toString method, of class Vector.
     */
//    @Test
//    public void testToString() {
//        System.out.println("toString");
//        Vector instance = null;
//        String expResult = "";
//        String result = instance.toString();
//        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
//    }

    /**
     * Test of main method, of class Vector.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Vector.main(args);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
