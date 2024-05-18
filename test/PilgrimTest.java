/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ffaat
 */
public class PilgrimTest {
    
    public PilgrimTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
   

    /**
     * Test of changePilgrimStatus method, of class Pilgrim.
     */
    @Test
    public void testChangePilgrimStatus() {
         System.out.println("changePilgrimStatus");
        boolean newStatus = false;
        Pilgrim instance = new Pilgrim();
        instance.setStatus(newStatus);
        boolean expResult = true;
        boolean result = instance.changePilgrimStatus();
        assertEquals(expResult, result);
    }

 
}
