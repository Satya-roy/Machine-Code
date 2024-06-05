package parkingSpotManager;

import parkingSpot.ParkingSpot;
import parkingStrategy.ParkingStrategy;


public abstract class ParkingSpotManager {
    public ParkingStrategy parkingStrategy;
    public ParkingSpotManager(ParkingStrategy parkingStrategy) {
        this.parkingStrategy = parkingStrategy;
    }

    public abstract ParkingSpot findParkingSpot();
    public abstract void parkVehicle();
    public abstract void removeVehicle();
}
