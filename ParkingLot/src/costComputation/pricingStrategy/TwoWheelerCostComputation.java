package costComputation.pricingStrategy;

import costComputation.CostComputation;
import costComputation.HourlyPricingStrategy;

public class TwoWheelerCostComputation extends CostComputation {
    public TwoWheelerCostComputation() {
        super(new HourlyPricingStrategy());
    }
}
