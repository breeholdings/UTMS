package transport;

public abstract class vehicle {
    private String plateNumber;

    public vehicle(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getPlateNumber() {
        return plateNumber;
    }
}
