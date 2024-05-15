


import java.util.Date;
import java.util.List;


public class NewMain {

    public static void main(String[] args) {
        Manager manager = new Manager();
        // Creating a group
        manager.testGroupClass( );
        
        Map piliglocation = new Map("Mecca");
        Pilgrim pilgrim = new Pilgrim("001", "Ahmed", true );
        pilgrim.setCurrentLocation(piliglocation);
        //(pilgrim,piliglocation);

        pilgrim.changePilgrimStatus();

        Trip trip = new Trip(101, "Mecca", "Riyadh", new Date(), new Date());
        manager.addTrip(trip);
    
        g group = new g("MyGroup");
        group.addPilgrim(new Pilgrim("Marah"));
        group.addPilgrim(new Pilgrim("Fatima"));
        group.addPilgrim(new Pilgrim("Aryam"));

        int pilgrimCount = group.getPilgrimCount();
        System.out.println("Number of pilgrims in the group: " + pilgrimCount);
        manager.displayTripInfo();
        
    }
}