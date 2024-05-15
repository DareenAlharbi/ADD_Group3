/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aryam
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
    @Test
    public void testNotifyStatusChange() {
        System.out.println("notifyStatusChange");
        Pilgrim pilgrim = null;
        Manager instance = new Manager();
        instance.notifyStatusChange(pilgrim);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

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
        System.out.println("removeTrip");
        Trip trip = null;
        Manager instance = new Manager();
        instance.removeTrip(trip);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
    @Test
    public void testTestGroupClass() {
        System.out.println("testGroupClass");
        Manager.testGroupClass();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addInfo method, of class Manager.
     */
    

    //Aryam
@Test
    public void testAddInfo() {
        System.out.println("addInfo");
        Manager p = new Manager(ArrayList<Trip> Trips );
        Trip instance = new Trip(21, "215F", "PANIC ATTACK");
        p.
        assertNotNull(Manager.getTrips());
        // TODO review the generated test code and remove the default call to fail.
    }//Aryam

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
     * Test of addPilgrims method, of class Manager.
     */
    
      //Reema
    @Test
    public void testAddPilgrims() {
        System.out.println("addPilgrims");
        ArrayList<Pilgrim> pilgrims = new ArrayList<Pilgrim>();
        Pilgrim p = new Pilgrim("2222","Aryam" , true) ;
        String expResult = "The Pilgrim successfully added to the system. ";
        String result = Manager.addPilgrims(pilgrims, p);
        assertEquals(expResult, result);
    }
    
}
