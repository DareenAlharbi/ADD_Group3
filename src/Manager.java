



import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Manager {
 
    private static ArrayList<Trip> Trips = new ArrayList<>();

    static ArrayList<Group> getGroups() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private List<Trip> trips;
    public static ArrayList<Group> groups = new ArrayList<>();
    private List<Pilgrim> pilgrims = new ArrayList<>();

  
    public static void CreateGroup(Scanner scanner) {

       Scanner input = new Scanner(System.in);

//create group
        System.out.print("Enter the group name: ");
        String groupName = input.nextLine();

        Group group = new Group(groupName);

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
            }
        }
    }

    public String addPilgrims(Group group, Pilgrim p) {
        group.addPilgrim(p);
        if (group.getPilgrims().contains(p)) {
            return "The Pilgrim successfully added to the group.";
        } else {
            return "The Pilgrim does not  added to the group. ";
        }
    }

    public String removePilgrim(Group group, Pilgrim pilgrim) {
        if (group.getPilgrims().contains(pilgrim)) {
            group.getPilgrims().remove(pilgrim);
            return "The Pilgrim has been successfully removed from the group.";
        } else {
            return "The Pilgrim is not in the group.";
        }
    }

//Aryam
    public static void setTrips(ArrayList<Trip> Trips) {
        Manager.Trips = Trips;
    }

    public void setPilgrims(List<Pilgrim> pilgrims, Pilgrim p) {
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

   // Group getGroupByName1(String group1) {
   //     throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
   // }

Group getGroupByName(String groupName) {
      
    for (Group group : groups) {
        if (group.getName().equals(groupName)) {
            return group;
        }
    }
    return null; // Return null if the group is not found
}
}