package vehicle.bike;

import vehicle.Vehicle;
import vehicle.VehicleType;

public class Bike extends Vehicle {
    private BikeType bikeType;
    public Bike(int id, int regNo, boolean isAvailable, boolean isDamaged, VehicleType type, BikeType bikeType) {
        super(id, regNo, isAvailable, isDamaged, type);
        this.bikeType = bikeType;
    }

    public BikeType getBikeType() {
        return bikeType;
    }

}
