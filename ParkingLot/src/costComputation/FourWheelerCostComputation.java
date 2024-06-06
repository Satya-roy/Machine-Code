package costComputation;

public class FourWheelerCostComputation extends CostComputation{
    public FourWheelerCostComputation() {
        super(new MinutePricingStrategy());
    }
}
