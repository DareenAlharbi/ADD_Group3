

public class Pilgrim {
 
    private String ID;
    private String name;
    private Map currentLocation;
    private boolean status;
    private Manager manager;

    public Pilgrim(String ID, String name, boolean status) {
        this.ID = ID;
        this.name = name;
       
        this.status = status;
       
    }

    Pilgrim() {
       
    }
    


    Pilgrim(String pilgrimName) {
        this.name = pilgrimName;
        
    }

    ///-------------------
   public boolean changePilgrimStatus( ) {
        if (this.status== true ) {
            //
            return  false ; // 
        }else 
        
        return true;
    }


    // Getters
    public String getID() {
        return ID;
    }

    public  String getName() {
        return name;
    }

    public Map getCurrentLocation() {
        return currentLocation;
    }

    public boolean getStatus() {
        return status;
    }

    public Manager getManager() {
        return manager;
    }

    // Setters
    public void setID(String ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCurrentLocation(Map currentLocation) {
        this.currentLocation = currentLocation;
        
    }

    public boolean isStatus() {
        return status;
    }
    
    

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }
    
    
}