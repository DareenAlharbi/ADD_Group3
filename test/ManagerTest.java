/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

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

    private InputStream sysInBackup;

    @Before
    public void setUp() {
        // Setup phase: Prepare the input data as it would be typed by the user
        String input = "TestGroup\nJohn Doe\nJane Doe\ndone\n";
        ByteArrayInputStream testIn = new ByteArrayInputStream(input.getBytes());
        System.setIn(testIn);

    }

    @AfterEach
    public void tearDown() {
        System.setIn(sysInBackup);
    }

    @Test
    public void testAddPilgrims() {
        System.out.println("addPilgrims");

        Pilgrim p = new Pilgrim("2222", "Aryam", true);

        Manager instance = new Manager();

        Group group = new Group("group1");

        String expResult = "The Pilgrim successfully added to the group.";

        String result = instance.addPilgrims(group, p);

        assertEquals(expResult, result);
    }

    @Test
    public void testRemovePilgrim() {
        System.out.println("removePilgrim");

        Pilgrim p = new Pilgrim("2222", "Aryam", true);

        Manager instance = new Manager();

        Group group = new Group("group1");
        group.getPilgrims().add(p);

        String expResult = "The Pilgrim has been successfully removed from the group.";

        String result = instance.removePilgrim(group, p);

        assertEquals(expResult, result);

        assertFalse(group.getPilgrims().contains(p));

    }

    @Test(expected = AssertionError.class)
    public void testCreateGroup() {
        // Set up the mock user input
        String Managerinput = "group1\nFatima\nMarah\ndone\n";

        // Redirect System.in to use the mock user input
        System.setIn(new ByteArrayInputStream(Managerinput.getBytes()));

        // Execute the method under test
        Manager instance = new Manager();
        instance.CreateGroup(new Scanner(System.in));

        // Verify the outcomes
        Group group = instance.getGroupByName("group1");

        assertNotNull("Group should have been created", group);
        assertEquals("Group should contain 1 pilgrim", 2, group.getPilgrims().size());
        assertEquals("FirstPilgrim should be Fatima", "Fatima", group.getPilgrims().get(0).getName());
        assertEquals("Second Pilgrim should be Marah", "Marah", group.getPilgrims().get(1).getName());
    }

}
