package parkingStrategy;

import parkingSpot.ParkingSpot;
import parkingSpot.TwoWheelerSpot;
import vehicle.Vehicle;
import vehicle.VehicleType;

import java.util.List;

public class TwoWheelerParkingStrategy implements ParkingStrategy{
    @Override
    public ParkingSpot findParkingSpot(List<ParkingSpot> parkingSpotList) {
        return new TwoWheelerSpot(1, false, new Vehicle(1, VehicleType.TWO_WHEELER), 100);
    }
}
