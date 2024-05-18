

public class Pilgrim {
 
    private String ID;
    private String name;
   
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
    public boolean currentState(boolean state) {
    this.status = state;
    return this.status;
}
   public boolean changePilgrimStatus() {
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

 

    public boolean getStatus() {
        
        return this.status;
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