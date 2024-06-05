package parkingSpotManager;

import parkingSpot.ParkingSpot;
import parkingStrategy.NearToEntryParkingStrategy;
import parkingStrategy.ParkingStrategy;

import java.util.ArrayList;
import java.util.List;

public class FourWheelerParkingSpotManager extends ParkingSpotManager{
    List<ParkingSpot> fourWheelerParkingSpotList = new ArrayList<>();

    FourWheelerParkingSpotManager(ParkingStrategy parkingStrategy) {
        super(new NearToEntryParkingStrategy());
    }

    //TODO : four wheeler parking strategy
    @Override
    public ParkingSpot findParkingSpot() {
        return parkingStrategy.findParkingSpot(fourWheelerParkingSpotList);
    }

    @Override
    public void parkVehicle() {

    }

    @Override
    public void removeVehicle() {

    }
}
