/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ffaat
 */
public class Manager_ {
public void trackPilgrimStatus(String ID ) {
  Map location= Map.getLoction(ID);  
  //boolean status = Pilgrim.changePilgrimStatus(ID, true, location); 
  boolean status= true;// have to delete
  if(status) {
   System.out.print("The pilgrim with ID " +ID+ "is stable");
   System.exit(0);
}
  
  if(status) {
   System.out.print("The pilgrim with ID "+ID+ "is not stable");
  
   MedicalEmergency.receiveStatusAlerts( ID , location);
}
    
    
}
}

