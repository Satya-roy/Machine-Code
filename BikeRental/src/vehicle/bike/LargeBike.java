package vehicle.bike;

import vehicle.VehicleType;

public class LargeBike extends Bike{
    public LargeBike(int id, int regNo, boolean isAvailable, boolean isDamaged) {
        super(id, regNo, isAvailable ,isDamaged, VehicleType.BIKE, BikeType.LARGE);
    }
}
