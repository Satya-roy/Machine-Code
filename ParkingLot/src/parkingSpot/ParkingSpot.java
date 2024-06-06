package parkingSpot;

import vehicle.Vehicle;

public abstract class ParkingSpot {
    private int id;
    private boolean isEmpty;
    private Vehicle vehicle;
    private int price;
    public ParkingSpot(int id, boolean isEmpty, Vehicle vehicle, int price) {
        this.id = id;
        this.isEmpty = isEmpty;
        this.vehicle = vehicle;
        this.price = price;
    }

    public void parkVehicle() {
        this.isEmpty = false;
    }

    public abstract int price();

    public void setId(int id) {
        this.id = id;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
