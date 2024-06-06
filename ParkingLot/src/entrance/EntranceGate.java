package entrance;

import parkingSpot.ParkingSpot;
import parkingSpotManager.ParkingSpotManager;
import parkingSpotManager.ParkingSpotManagerFactory;
import ticket.Ticket;
import vehicle.Vehicle;
import vehicle.VehicleType;

public class EntranceGate {
    ParkingSpotManager parkingSpotManager;
    public EntranceGate (ParkingSpotManager parkingSpotManager) {
        this.parkingSpotManager = parkingSpotManager;
    }
    // findParkingSpace
    public ParkingSpot findParkingSpace(VehicleType type) {
        return parkingSpotManager.findParkingSpot();
    }
    // generate Ticket
    public Ticket generateTicket(int id, Vehicle vehicle, ParkingSpot parkingSpot, int entryTime) {
        return new Ticket(id, vehicle, parkingSpot, entryTime);
    }
    // book spot
    public void bookSpot(ParkingSpot parkingSpot, Vehicle vehicle) {
        parkingSpotManager.parkVehicle(parkingSpot, vehicle);
    }
}
