package vehicle.bike;

public interface BikeManager {
    void addBike(Bike bike);
    void removeBike(Bike bike);
    int getCountForAvailableBike();
    int getCountForNonAvailableBike();
    int getBikeCount();
}
