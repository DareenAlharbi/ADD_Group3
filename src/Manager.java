/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aryam
 */
public class Manager {
  
  public void trackPilgrimStatus(String ID ) {
  Map location= Map.getLoction(ID);  
  //boolean status = Pilgrim.changePilgrimStatus(ID, true, location); // have problem
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
