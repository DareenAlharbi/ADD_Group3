
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NewMain {
    static List<Group> groups = new ArrayList<>();
public static void main(String[] args) {

Scanner input = new Scanner(System.in);
    String role = "";
    while (!role.equalsIgnoreCase("done")) {
        System.out.println("Enter your role ('manager' or 'pilgrim'), or enter 'done' to exit: ");
        role = input.nextLine();

        switch (role.toLowerCase()) {
            case "manager":
                handleManagerRole();
                break;

            case "pilgrim":
                handlePilgrimRole();
                break;

            case "done":
                System.out.println("Exiting the program...");
                break;

            default:
                System.out.println("Invalid role. Please try again.");
                break;
        }
    }
}

private static void handleManagerRole() {
    Manager manager = new Manager();
    Group group = null;

    boolean continueManaging = true;

    while (continueManaging) {
        System.out.println("Enter an option:");
        System.out.println("1. Create a group");
        System.out.println("2. Add a pilgrim to a group");
        System.out.println("3. Remove group information");
        System.out.println("4. Print group information");
        System.out.println("5. Exit");

        Scanner input = new Scanner(System.in);
        String option = input.nextLine();

        switch (option) {
            case "1":
                System.out.print("Enter the group name: ");
                String groupName = input.nextLine();
                group = new Group(groupName);
                groups.add(group);
                System.out.println("Group created successfully.");
                break;

           case "2":
    if (groups.isEmpty()) {
        System.out.println("No groups have been created yet.");
    } else {
        System.out.println("Choose a group to add the pilgrims to:");
        for (int i = 0; i < groups.size(); i++) {
            System.out.println((i + 1) + ". " + groups.get(i).getName());
        }

        int groupIndex = input.nextInt();
        input.nextLine(); // Consume the newline character

        if (groupIndex >= 1 && groupIndex <= groups.size()) {
            Group selectedGroup = groups.get(groupIndex - 1);
            boolean addMorePilgrims = true;
            while (addMorePilgrims) {
                System.out.print("Enter the pilgrim name (enter 'done' to finish adding): ");
                String pilgrimName = input.nextLine();
                if (pilgrimName.equalsIgnoreCase("done")) {
                    addMorePilgrims = false;
                } else {
                    Pilgrim pilgrim = new Pilgrim(pilgrimName);
                    selectedGroup.addPilgrim(pilgrim);
                    System.out.println(pilgrim.getName() + " has been added to the group.");
                }
            }
        } else {
            System.out.println("Invalid group selection.");
        }
    }
    break;

            
            
                
                case "3":
    if (groups.isEmpty()) {
        System.out.println("No groups have been created yet.");
    } else {
        System.out.println("Choose a group to remove a pilgrim from:");
        for (int i = 0; i < groups.size(); i++) {
            System.out.println((i + 1) + ". " + groups.get(i).getName());
        }

        int groupIndex = input.nextInt();
        input.nextLine(); // Consume the newline character

        if (groupIndex >= 1 && groupIndex <= groups.size()) {
            Group selectedGroup = groups.get(groupIndex - 1);
            List<Pilgrim> pilgrims = selectedGroup.getPilgrims();

            if (pilgrims.isEmpty()) {
                System.out.println("No pilgrims in this group.");
            } else {
                System.out.println("Choose a pilgrim to remove:");
                for (int i = 0; i < pilgrims.size(); i++) {
                    System.out.println((i + 1) + ". " + pilgrims.get(i).getName());
                }

                int pilgrimIndex = input.nextInt();
                input.nextLine(); // Consume the newline character

                if (pilgrimIndex >= 1 && pilgrimIndex <= pilgrims.size()) {
                    Pilgrim selectedPilgrim = pilgrims.get(pilgrimIndex - 1);
                    selectedGroup.removePilgrim1
        (selectedPilgrim);
                    System.out.println(selectedPilgrim.getName() + " has been removed from the group.");
                } else {
                    System.out.println("Invalid pilgrim selection.");
                }
            }
        } else {
            System.out.println("Invalid group selection.");
        }
    }
    break;
    case "4":
                if (groups.isEmpty()) {
                    System.out.println("No groups have been created yet.");
                } else {
                    System.out.println("Group information:");
                    for (Group g : groups) {
                        System.out.println("Group Name: " + g.getName());
                        List<Pilgrim> pilgrims = g.getPilgrims();
                        if (pilgrims.isEmpty()) {
                            System.out.println("No pilgrims in this group.");
                        } else {
                            System.out.println("Pilgrims in this group:");
                            for (Pilgrim pilgrim : pilgrims) {
                                System.out.println("- " + pilgrim.getName());
                            }
                        }
                    }
                }
                break;

    case "5":
                continueManaging = false;
                break;

            default:
                System.out.println("Invalid option. Please try again.");
                break;
        }
    }
}

private static void handlePilgrimRole() {
    System.out.println("Enter your name: ");
    Scanner input = new Scanner(System.in);
    String pilgrimName = input.nextLine();
Pilgrim pilgrim = new Pilgrim(pilgrimName);
    System.out.println("Welcome, " + pilgrimName + "!");

    boolean continueModifyingStatus = true;

    while (continueModifyingStatus) {
        System.out.println("Enter an option:");
        System.out.println("1. Change status");
        System.out.println("2. Exit");

        String option = input.nextLine();

        switch (option) {
            case "1":
    System.out.println("Current status: " + pilgrim.getStatus());
    System.out.println("Enter the new status: ");
    boolean newStatus = input.nextBoolean();
    input.nextLine(); // Consume the newline character
    pilgrim.currentState(newStatus);
    System.out.println("Current status: " + pilgrim.getStatus());
    System.out.println("Status has been updated successfully.");
    break;

            case "2":manager:
                    
                continueModifyingStatus = false;
                break;

            default:
                System.out.println("Invalid option. Please try again.");
                break;
        }
    }
}
}