package vehicle.bike;
import java.util.List;

public class BikeManagerImpl implements BikeManager{
    private List<Bike> bikeList;

    public BikeManagerImpl(List<Bike> bikeList) {
        this.bikeList = bikeList;
    }
    @Override
    public void addBike(Bike bike) {
        bikeList.add(bike);
    }
    @Override
    public void removeBike(Bike bike) {
        int n = bikeList.size();
        for(int i=0; i<n; i++) {
            if(bike.getRegNo() == bikeList.get(i).getRegNo()) {
                bikeList.remove(i);
                return;
            }
        }
        //log -> Bike doesnot exist
    }

    @Override
    public int getCountForAvailableBike() {
        int count = 0;
        for (Bike bike : bikeList) {
            if (bike.isAvailable()) {
                count++;
            }
        }
        return count;
    }

    @Override
    public int getCountForNonAvailableBike() {
        int count = 0;
        for (Bike bike : bikeList) {
            if (!bike.isAvailable()) {
                count++;
            }
        }
        return count;
    }

    @Override
    public int getBikeCount() {
        return bikeList.size();
    }
}
