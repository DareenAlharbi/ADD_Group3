/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ffaat
 */
public class PilgrimTest {
    
    public PilgrimTest() {
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

    /**
     * Test of getID method, of class Pilgrim.
     */
    @Test
    public void testGetID() {
        System.out.println("getID");
        Pilgrim instance = new Pilgrim();
        String expResult = "";
        String result = instance.getID();
        assertEquals(expResult, result);
      
    }

    /**
     * Test of getName method, of class Pilgrim.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Pilgrim instance = new Pilgrim();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getCurrentLocation method, of class Pilgrim.
     */
    @Test
    public void testGetCurrentLocation() {
        System.out.println("getCurrentLocation");
        Pilgrim instance = new Pilgrim();
        Map expResult = null;
        Map result = instance.getCurrentLocation();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getStatus method, of class Pilgrim.
     */
    @Test
    public void testGetStatus() {
        System.out.println("getStatus");
        Pilgrim instance = new Pilgrim();
        boolean expResult = false;
        boolean result = instance.getStatus();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getManager method, of class Pilgrim.
     */
    @Test
    public void testGetManager() {
        System.out.println("getManager");
        Pilgrim instance = new Pilgrim();
        Manager expResult = null;
        Manager result = instance.getManager();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setID method, of class Pilgrim.
     */
    @Test
    public void testSetID() {
        System.out.println("setID");
        String ID = "";
        Pilgrim instance = new Pilgrim();
        instance.setID(ID);
        
    }

    /**
     * Test of setName method, of class Pilgrim.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Pilgrim instance = new Pilgrim();
        instance.setName(name);
        
    }

    /**
     * Test of setCurrentLocation method, of class Pilgrim.
     */
    @Test
    public void testSetCurrentLocation() {
        System.out.println("setCurrentLocation");
        Map currentLocation = null;
        Pilgrim instance = new Pilgrim();
        instance.setCurrentLocation(currentLocation);
        
    }

    /**
     * Test of isStatus method, of class Pilgrim.
     */
    @Test
    public void testIsStatus() {
        System.out.println("isStatus");
        Pilgrim instance = new Pilgrim();
        boolean expResult = false;
        boolean result = instance.isStatus();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setStatus method, of class Pilgrim.
     */
    @Test
    public void testSetStatus() {
        System.out.println("setStatus");
        boolean status = false;
        Pilgrim instance = new Pilgrim();
        instance.setStatus(status);
       
    }

    /**
     * Test of setManager method, of class Pilgrim.
     */
    @Test
    public void testSetManager() {
        System.out.println("setManager");
        Manager manager = null;
        Pilgrim instance = new Pilgrim();
        instance.setManager(manager);
        
    }
    
}
