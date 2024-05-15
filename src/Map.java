

public class Map {
    
    private String location;

    public Map(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    // تحديث موقع الحاج داخل كلاس Map
    public void updatePilgrimLocation(Pilgrim pilgrim, String newLocation) {
        if (pilgrim != null && newLocation != null && !newLocation.isEmpty()) {
            this.location = newLocation;
            System.out.println("Updating location for Pilgrim ID: " + pilgrim.getID() + " to " + newLocation);
        } else {
            System.out.println("Invalid location or pilgrim information provided.");
        }
    }}
