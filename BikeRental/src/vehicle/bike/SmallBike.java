package vehicle.bike;

import vehicle.VehicleType;

public class SmallBike extends Bike{
    public SmallBike(int id, int regNo, boolean isAvailable, boolean isDamaged) {
        super(id, regNo, isAvailable ,isDamaged, VehicleType.BIKE, BikeType.SMALL);
    }
}
