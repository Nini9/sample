/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author niniopara
 */
public class BalanceTest {
    
    public BalanceTest() {
        
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getCurrentBalance method, of class Balance.
     */
    @Test
    public void testGetCurrentBalance() {
        System.out.println("getCurrentBalance");
        Balance instance = new Balance(150.4, "11/9/18");
        double expResult = 150.4;
        double result = instance.getCurrentBalance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCurrentBalance method, of class Balance.
     */
//    @Test
//    public void testSetCurrentBalance() {
//        System.out.println("setCurrentBalance");
//        double currentBalance = 0.0;
//        Balance instance = null;
//        instance.setCurrentBalance(currentBalance);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of getDate method, of class Balance.
     */
    @Test
    public void testGetDate() {
        System.out.println("getDate");
        Balance instance = new Balance(150.4, "11/9/18");;
        String expResult = "11/9/18";
        String result = instance.getDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDate method, of class Balance.
     */
//    @Test
//    public void testSetDate() {
//        System.out.println("setDate");
//        String date = "";
//        Balance instance = null;
//        instance.setDate(date);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of toString method, of class Balance.
     */
//    @Test
//    public void testToString() {
//        System.out.println("toString");
//        Balance instance = null;
//        String expResult = "";
//        String result = instance.toString();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
