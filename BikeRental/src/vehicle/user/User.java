package vehicle.user;

public class User {
    private int id;
    private int licenseNo;
    private boolean isVehicleAssigned;

    public User(int id, int licenseNo) {
        this.id = id;
        this.licenseNo = licenseNo;
        this.isVehicleAssigned = false;
    }

    public void setVehicleAssigned(boolean vehicleAssigned) {
        isVehicleAssigned = vehicleAssigned;
    }
}
