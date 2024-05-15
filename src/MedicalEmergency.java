

public class MedicalEmergency {
    public static void checkPilgrim(Pilgrim pilgrim) {
        if (pilgrim.getStatus()==(true)) {
            System.out.println("Emergency alert for Pilgrim: " + pilgrim.getName());
        }
    }
}