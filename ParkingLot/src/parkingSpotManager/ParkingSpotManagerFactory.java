package parkingSpotManager;

import parkingStrategy.DefaultParkingStrategy;
import parkingStrategy.NearToEntryParkingStrategy;
import vehicle.VehicleType;

public class ParkingSpotManagerFactory {
    private ParkingSpotManagerFactory() {};

    public static ParkingSpotManager getParkingSpotManager(VehicleType type) {
        return switch (type) {
            case TWO_WHEELER -> new TwoWheelerParkingSpotManager(new NearToEntryParkingStrategy());
            case FOUR_WHEELER -> new FourWheelerParkingSpotManager((new DefaultParkingStrategy()));
        };
    }
}
