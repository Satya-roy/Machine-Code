package parkingSpot;

import vehicle.Vehicle;

public class FourWheelerSpot extends ParkingSpot{
    public FourWheelerSpot(int id, boolean isEmpty, Vehicle vehicle, int price) {
        super(id, isEmpty, vehicle, price);
    }

    @Override
    public int price() {
        return 100;
    }
}
