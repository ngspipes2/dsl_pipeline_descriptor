package pt.isel.ngspipes.pipeline_descriptor.step.spread.strategyDescriptor;

public interface ICombineStrategyDescriptor extends IStrategyDescriptor {

    IStrategyDescriptor getFirstStrategy();
    void setFirstStrategy(IStrategyDescriptor firstStrategy);

    IStrategyDescriptor getSecondStrategy();
    void setSecondStrategy(IStrategyDescriptor secondStrategy);

}
