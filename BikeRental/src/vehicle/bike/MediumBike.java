package vehicle.bike;

import vehicle.VehicleType;

public class MediumBike extends Bike{
    public MediumBike(int id, int regNo, boolean isAvailable, boolean isDamaged) {
        super(id, regNo, isAvailable ,isDamaged, VehicleType.BIKE, BikeType.MEDIUM);
    }
}
