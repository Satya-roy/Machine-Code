package parkingSpotManager;

import parkingSpot.ParkingSpot;
import parkingStrategy.ParkingStrategy;
import parkingStrategy.TwoWheelerParkingStrategy;

import java.util.ArrayList;
import java.util.List;

public class TwoWheelerParkingSpotManager extends ParkingSpotManager {
    public TwoWheelerParkingSpotManager(ParkingStrategy parkingStrategy) {
        super(new TwoWheelerParkingStrategy());
    }

    List<ParkingSpot> twoWheelerParkingSpotList = new ArrayList<>();

    //TODO : two wheeler parking strategy
    @Override
    public ParkingSpot findParkingSpot() {
        return parkingStrategy.findParkingSpot(twoWheelerParkingSpotList);
    }

    @Override
    public void parkVehicle() {

    }

    @Override
    public void removeVehicle() {

    }
}
