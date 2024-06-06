package costComputation;

import ticket.Ticket;
import vehicle.VehicleType;

public class CostComputationFactory {
    public static CostComputation getCostComputation(VehicleType type) {
        return switch (type) {
            case TWO_WHEELER -> new TwoWheelerCostComputation();
            case FOUR_WHEELER -> new FourWheelerCostComputation();
        };
    }
}
