package parkingSpot;

import vehicle.Vehicle;

public class TwoWheelerSpot extends ParkingSpot{
    public TwoWheelerSpot(int id, boolean isEmpty, Vehicle vehicle, int price) {
        super(id, isEmpty, vehicle, price);
    }

    @Override
    public int price() {
        return 100;
    }
}
