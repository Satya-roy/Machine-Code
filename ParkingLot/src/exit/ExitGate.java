package exit;

import costComputation.CostComputation;
import costComputation.TwoWheelerCostComputation;
import parkingSpot.ParkingSpot;
import parkingSpotManager.ParkingSpotManager;
import ticket.Ticket;

public class ExitGate {
    ParkingSpotManager parkingSpotManager;

    public ExitGate(ParkingSpotManager parkingSpotManager) {
        this.parkingSpotManager = parkingSpotManager;
    }

    public void freeParkingSpace(Ticket ticket) {
        ParkingSpot parkingSpot = ticket.getParkingSpot();
        parkingSpot.setEmpty(true);
        parkingSpot.setVehicle(null);
    }

    public int calculateCost(Ticket ticket) {
        //TODO : calculate cost of parking by creating costComputation object by vehicle type strategy by Vehicle Type
        CostComputation costComputation = new TwoWheelerCostComputation();
        return costComputation.calculateCost(ticket.getEntryTime());
    }
}
