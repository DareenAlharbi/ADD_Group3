/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
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
public class ManagerTest {
    
    public ManagerTest() {
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
     * Test of setPilgrims method, of class Manager.
     */
    @Test
    public void testSetPilgrims_List_Pilgrim() {
        System.out.println("setPilgrims");
        List<Pilgrim> pilgrims = null;
        Pilgrim p = null;
        Manager instance = new Manager();
        instance.setPilgrims(pilgrims, p);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTrips method, of class Manager.
     */
    @Test
    public void testSetTrips_List() {
        System.out.println("setTrips");
        List<Trip> trips = null;
        Manager instance = new Manager();
        instance.setTrips(trips);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of notifyStatusChange method, of class Manager.
     */
   

    /**
     * Test of addTrip method, of class Manager.
     */
    @Test
    public void testAddTrip() {
        System.out.println("addTrip");
        Trip trip = null;
        Manager instance = new Manager();
        instance.addTrip(trip);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeTrip method, of class Manager.
     */
    @Test
    public void testRemoveTrip() {
        System.out.println("removePilgrim");

        Pilgrim p = new Pilgrim("2222", "Aryam", true);
     
        Manager instance = new Manager();
      
        g group = new g("group1");
        group.getPilgrims().add(p);  

        String expResult = "The Pilgrim has been successfully removed from the group.";
       
        String result = instance.removePilgrim(group, p);
        
        assertEquals(expResult, result);
        
        assertFalse(group.getPilgrims().contains(p));

    }

    /**
     * Test of displayTrips method, of class Manager.
     */
    @Test
    public void testDisplayTrips() {
        System.out.println("displayTrips");
        Manager instance = new Manager();
        String expResult = "";
        String result = instance.displayTrips();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of testGroupClass method, of class Manager.
     */
    @Test(expected = InputMismatchException.class)
    public void testTestGroupClass_InputMismatchException() {
      

        Manager.testGroupClass();
    }



    /**
     * Test of addPilgrims method, of class Manager.
     */
    @Test
    public void testAddPilgrims() {
      System.out.println("addPilgrims");
        

        Pilgrim p = new Pilgrim("2222", "Aryam", true);

        Manager instance = new Manager();

        g group = new g("group1");
        
        String expResult = "The Pilgrim successfully added to the group.";

        String result = instance.addPilgrims(group, p);
  
        assertEquals(expResult, result);
    }
    

    /**
     * Test of addInfo method, of class Manager.
     */
    @Test
    public void testAddInfo() {
        System.out.println("addInfo");
        Manager.addInfo();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTrips method, of class Manager.
     */
    @Test
    public void testSetTrips_ArrayList() {
        System.out.println("setTrips");
        ArrayList<Trip> Trips = null;
        Manager.setTrips(Trips);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPilgrims method, of class Manager.
     */
    @Test
    public void testSetPilgrims_List() {
        System.out.println("setPilgrims");
        List<Pilgrim> pilgrims = null;
        Manager instance = new Manager();
        instance.setPilgrims(pilgrims);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTrips method, of class Manager.
     */
    @Test
    public void testGetTrips() {
        System.out.println("getTrips");
        ArrayList<Trip> expResult = null;
        ArrayList<Trip> result = Manager.getTrips();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPilgrims method, of class Manager.
     */
    @Test
    public void testGetPilgrims() {
        System.out.println("getPilgrims");
        Manager instance = new Manager();
        List<Pilgrim> expResult = null;
        List<Pilgrim> result = instance.getPilgrims();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayTripInfo method, of class Manager.
     */
    @Test
    public void testDisplayTripInfo() {
        System.out.println("displayTripInfo");
        Manager instance = new Manager();
        instance.displayTripInfo();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removePilgrim method, of class Manager.
     */
    @Test
    public void testRemovePilgrim() {
        System.out.println("removePilgrim");
        g group = null;
        Pilgrim pilgrim = null;
        Manager instance = new Manager();
        String expResult = "";
        String result = instance.removePilgrim(group, pilgrim);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGroupByName method, of class Manager.
     */
}
