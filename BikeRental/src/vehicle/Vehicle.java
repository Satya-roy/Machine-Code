package vehicle;

import vehicle.bike.BikeType;

public class Vehicle {
    private int id;
    private int regNo;
    private boolean isAvailable;
    private boolean isDamaged;
    private VehicleType vehicleType;

    public Vehicle(int id, int regNo, boolean isAvailable, boolean isDamaged, VehicleType vehicleType) {
        this.id = id;
        this.regNo = regNo;
        this.isAvailable = isAvailable;
        this.isDamaged = isDamaged;
        this.vehicleType = vehicleType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRegNo() {
        return regNo;
    }

    public void setRegNo(int regNo) {
        this.regNo = regNo;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public boolean isDamaged() {
        return isDamaged;
    }

    public void setDamaged(boolean damaged) {
        isDamaged = damaged;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
}
