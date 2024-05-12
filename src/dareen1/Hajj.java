package dareen1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author m.als
 */

import java.util.Scanner;
public class Hajj {
     
 

    
  
   public static void testGroupClass() {
        Scanner input = new Scanner(System.in);

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
            }
        }

        System.out.println("\nGroup Name: " + group.getName());
        System.out.println("Pilgrims:");
        for (Pilgrim pilgrim : group.getPilgrims()) {
            System.out.println(pilgrim.getName());
        }
    }
}

