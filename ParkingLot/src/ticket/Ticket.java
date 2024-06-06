package ticket;

import parkingSpot.ParkingSpot;
import parkingSpotManager.ParkingSpotManager;
import vehicle.Vehicle;

public class Ticket {
    private int ticketId;
    private Vehicle vehicle;
    private ParkingSpot parkingSpot;
    private int entryTime;

    public Ticket(int ticketId, Vehicle vehicle, ParkingSpot parkingSpot, int entryTime) {
        this.ticketId = ticketId;
        this.vehicle = vehicle;
        this.parkingSpot = parkingSpot;
        this.entryTime = entryTime;
    }

    public int getTicketId() {
        return ticketId;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public int getEntryTime() {
        return entryTime;
    }
}
