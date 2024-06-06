package exit;

import costComputation.CostComputation;
import costComputation.CostComputationFactory;
import parkingSpot.ParkingSpot;
import parkingSpotManager.ParkingSpotManager;
import ticket.Ticket;
import vehicle.VehicleType;

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
        // if(ticket.getVehicle().getType == VehicleType.TWO_WHEELER)
        CostComputation costComputation = CostComputationFactory.getCostComputation(VehicleType.TWO_WHEELER);
        return costComputation.calculateCost(ticket.getEntryTime());
    }

    // TODO : similar to calculate cost, use payment Strategy class to create cash card or UPI payement
    public void paymentMode() {

    }
}
