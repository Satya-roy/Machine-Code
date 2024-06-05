package parkingStrategy;

import parkingSpot.FourWheelerSpot;
import parkingSpot.ParkingSpot;
import vehicle.Vehicle;
import vehicle.VehicleType;

import java.util.List;

public class DefaultParkingStrategy implements ParkingStrategy{
    @Override
    public ParkingSpot findParkingSpot(List<ParkingSpot> parkingSpotList) {
        return new FourWheelerSpot(1, false, new Vehicle(1, VehicleType.TWO_WHEELER), 100);
    }
}
