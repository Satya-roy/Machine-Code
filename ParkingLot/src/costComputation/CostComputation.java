package costComputation;

public class CostComputation {
    public PricingStrategy pricingStrategy;
    public CostComputation(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }
    public int calculateCost(int entryTime) {
        return pricingStrategy.pricing();
    }
}
