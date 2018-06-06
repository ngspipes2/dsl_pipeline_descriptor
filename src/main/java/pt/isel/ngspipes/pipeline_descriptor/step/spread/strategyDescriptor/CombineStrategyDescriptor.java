package pt.isel.ngspipes.pipeline_descriptor.step.spread.strategyDescriptor;

public abstract class CombineStrategyDescriptor extends StrategyDescriptor implements ICombineStrategyDescriptor {

    private IStrategyDescriptor firstStrategy;
    @Override public IStrategyDescriptor getFirstStrategy() { return this.firstStrategy; }
    @Override public void setFirstStrategy(IStrategyDescriptor firstStrategy) { this.firstStrategy = firstStrategy; }

    private IStrategyDescriptor secondStrategy;
    @Override public IStrategyDescriptor getSecondStrategy() { return this.secondStrategy; }
    @Override public void setSecondStrategy(IStrategyDescriptor secondStrategy) { this.secondStrategy = secondStrategy; }



    public CombineStrategyDescriptor(IStrategyDescriptor firstStrategy, IStrategyDescriptor secondStrategy) {
        this.firstStrategy = firstStrategy;
        this.secondStrategy = secondStrategy;
    }

    public CombineStrategyDescriptor() { }

}
