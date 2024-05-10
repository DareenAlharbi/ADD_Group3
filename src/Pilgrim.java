






/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author m.als
 */
public class Pilgrim {

    
    private String Pilgrim_Fname;
    private String ID;
    private boolean status;
    private Map currentLocation;
    
  
   public Pilgrim(String name, String ID, boolean status) {
        this.Pilgrim_Fname = Pilgrim_Fname;
        this.ID = ID;
        this.status = status;
    }

    public Pilgrim(String Pilgrim_name) {
        this.Pilgrim_Fname = Pilgrim_name;
    }

    public String getName() {
        return Pilgrim_Fname;
    
}
   
    
    public void changePilgrimStatus(String ID , boolean status , Map currentLocation  ){
     
    if(status == true) {
      System.out.print("The pilgrim with ID " + this.Pilgrim_Fname + " - " +ID+" is stable ");
    }
    if(status == false) {
       System.out.print("The pilgrim with ID " + this.Pilgrim_Fname + " - " +ID+" is not stable ");
        currentLocation =  Map.getLoction(ID);
   
       MedicalEmergency.receiveStatusAlerts(ID,currentLocation);
    }
  }
    
    
    
    }



