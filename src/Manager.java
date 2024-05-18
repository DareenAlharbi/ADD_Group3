

import java.io.InputStream;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Manager {
    private static ArrayList<Trip> Trips = new ArrayList<>();
     private static ArrayList<g> groups = new ArrayList<>();

    public static ArrayList<g> getGroups() {
        return groups;
    }

    
    public void setPilgrims(List<Pilgrim> pilgrims,Pilgrim p) {
        this.pilgrims = pilgrims;
    }

    public void setTrips(List<Trip> trips) {
        this.trips = trips;
    }
    private List<Pilgrim> pilgrims = new ArrayList<>();
    private List<Trip> trips = new ArrayList<>();
//Aryam
    public Manager() {
    }

    public void addTrip(Trip trip) {
        this.trips.add(trip);
    }

    public void removeTrip(Trip trip) {
        this.trips.remove(trip);
    }
   

   
    public String displayTrips() {
        StringBuilder sb = new StringBuilder();
        for (Trip trip : trips) {
            sb.append(trip.toString()).append(" ");
        }
        return sb.toString();
    }
     public g getGroupByName(String groupName) {
        for (g group : groups) {
            if (group.getName().equals(groupName)) {
                return group;
            }
        }
        return null; // Group not found
    }
//3 funcation    
public static void CreateGroup( Scanner input) {
  
//create group
    System.out.print("Enter the group name: ");
    String groupName = input.nextLine();

    g group = new g(groupName);

    boolean continueAdding = true;
    while (continueAdding) {
        System.out.print("Enter the pilgrim name (or 'done' to finish adding): ");
        String pilgrimName = input.nextLine();

        if (pilgrimName.equalsIgnoreCase("done")) {
            continueAdding = false;
        } else {
            Pilgrim pilgrim = new Pilgrim(pilgrimName);
            group.addPilgrim(pilgrim);
            System.out.println(pilgrim.getName() + " has been added to the group.");
        }}}
    
   
public  String addPilgrims(g group ,Pilgrim p) {
          group.addPilgrim(p);
        if(group.getPilgrims().contains(p)){
        return "The Pilgrim successfully added to the group." ;
        }else
            return "The Pilgrim does not  added to the group. " ;
}
public String removePilgrim(g group, Pilgrim pilgrim) {
        if (group.getPilgrims().contains(pilgrim)) {
            group.getPilgrims().remove(pilgrim);
            return "The Pilgrim has been successfully removed from the group.";
        } else {
            return "The Pilgrim is not in the group.";
        }}


    
public static void addInfo() {
        Scanner input = new Scanner(System.in);

        System.out.print("Location: ");
        String tripId = input.nextLine();
        System.out.print("destination: ");
        String destination = input.nextLine();
        System.out.print("source: ");
        String source = input.nextLine();
        System.out.print("startDate: ");
        String startDate = input.nextLine();
        System.out.print("endDate: ");
        String endDate = input.nextLine();

        Trip info = new Trip( tripId,  destination,  source,  startDate,  endDate);
        Trips.add(info);
        
      
        System.out.println(info.toString());
        System.out.println("done");
    }
//Aryam

    public static void setTrips(ArrayList<Trip> Trips) {
        Manager.Trips = Trips;
    }

    public void setPilgrims(List<Pilgrim> pilgrims) {
        this.pilgrims = pilgrims;
    }

    public static ArrayList<Trip> getTrips() {
        return Trips;
    }

    public List<Pilgrim> getPilgrims() {
        return pilgrims;
    }
   //-----------------------------------------------
    //------------------ 1 function --------------------
    public void displayTripInfo() {
        System.out.println("Trip Information:");
        for (Trip trip : trips) {
            System.out.println(trip.toString());
        }
    }
}
    
    