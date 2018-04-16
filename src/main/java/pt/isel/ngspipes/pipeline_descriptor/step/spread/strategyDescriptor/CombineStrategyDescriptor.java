package pt.isel.ngspipes.pipeline_descriptor.step.spread.strategyDescriptor;

public class CombineStrategyDescriptor extends StrategyDescriptor implements ICombineStrategyDescriptor {

    private IStrategyDescriptor firstStrategy;
    @Override public IStrategyDescriptor getFirstStrategy() { return this.firstStrategy; }
    public void setFirstStrategy(IStrategyDescriptor firstStrategy) { this.firstStrategy = firstStrategy; }

    private IStrategyDescriptor secondStrategy;
    @Override public IStrategyDescriptor getSecondStrategy() { return this.secondStrategy; }
    public void setSecondStrategy(IStrategyDescriptor secondStrategy) { this.secondStrategy = secondStrategy; }



    public CombineStrategyDescriptor(IStrategyDescriptor firstStrategy, IStrategyDescriptor secondStrategy) {
        this.firstStrategy = firstStrategy;
        this.secondStrategy = secondStrategy;
    }

    public CombineStrategyDescriptor() { }

}
