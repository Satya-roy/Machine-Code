package parkingSpotManager;

import parkingSpot.ParkingSpot;
import parkingStrategy.ParkingStrategy;
import vehicle.Vehicle;


public abstract class ParkingSpotManager {
    public ParkingStrategy parkingStrategy;
    public ParkingSpotManager(ParkingStrategy parkingStrategy) {
        this.parkingStrategy = parkingStrategy;
    }

    public abstract ParkingSpot findParkingSpot();
    public abstract void parkVehicle(ParkingSpot parkingSpot, Vehicle vehicle);
    public abstract void removeVehicle();
}
