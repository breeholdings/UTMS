package users;

public class transportofficer extends user {
    public transportofficer(String name, String id) {
        super(name, id);
    }

    @Override
    public void requestTransport() {
        System.out.println("Transport Officer " + getName() + " requested official transport.");
    }

    public void assignDriver(String vehicleType) {
        System.out.println("Assigning driver for " + vehicleType);
    }

    public void assignDriver(String vehicleType, String shiftTime) {
        System.out.println("Assigning driver for " + vehicleType + " on shift: " + shiftTime);
    }
}
