package costComputation;

import costComputation.pricingStrategy.MinutePricingStrategy;

public class FourWheelerCostComputation extends CostComputation{
    public FourWheelerCostComputation() {
        super(new MinutePricingStrategy());
    }
}
