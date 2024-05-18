


import java.util.Date;
import java.util.List;
import java.util.Scanner;

///-------------------
public class NewMain {

    public static void main(String[] args) {
       Manager manager = new Manager();
        // Creating a group
        Pilgrim pilgrim = new Pilgrim("001", "Ahmed", true );
        g group = new g("MyGroup");
       manager.addPilgrims(group, pilgrim);
        manager.CreateGroup( new Scanner(System.in) );
       
        pilgrim.changePilgrimStatus();

        Trip trip = new Trip(101, "Mecca", "Riyadh", new Date(), new Date());
        manager.addTrip(trip);
    
        group.addPilgrim(new Pilgrim("Marah"));
        group.addPilgrim(new Pilgrim("Fatima"));
        group.addPilgrim(new Pilgrim("Aryam"));

        int pilgrimCount = group.getPilgrimCount();
        System.out.println("Number of pilgrims in the group: " + pilgrimCount);
        manager.displayTripInfo();
    }
}