package parkingSpotManager;

import parkingSpot.ParkingSpot;
import parkingStrategy.ParkingStrategy;
import parkingStrategy.NearToExitParkingStrategy;
import vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class TwoWheelerParkingSpotManager extends ParkingSpotManager {
    public TwoWheelerParkingSpotManager(ParkingStrategy parkingStrategy) {
        super(new NearToExitParkingStrategy());
    }

    List<ParkingSpot> twoWheelerParkingSpotList = new ArrayList<>();

    //TODO : two wheeler parking strategy
    @Override
    public ParkingSpot findParkingSpot() {
        return parkingStrategy.findParkingSpot(twoWheelerParkingSpotList);
    }

    @Override
    public void parkVehicle(ParkingSpot parkingSpot, Vehicle vehicle) {
        parkingSpot.setEmpty(false);
        parkingSpot.setVehicle(vehicle);
    }

    @Override
    public void removeVehicle() {

    }
}
