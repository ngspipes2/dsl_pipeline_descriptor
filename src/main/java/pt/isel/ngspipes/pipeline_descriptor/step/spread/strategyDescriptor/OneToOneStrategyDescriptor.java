package pt.isel.ngspipes.pipeline_descriptor.step.spread.strategyDescriptor;

public class OneToOneStrategyDescriptor extends CombineStrategyDescriptor implements IOneToOneStrategyDescriptor {

    public OneToOneStrategyDescriptor(IStrategyDescriptor firstStrategy, IStrategyDescriptor secondStrategy) {
        super(firstStrategy, secondStrategy);
    }

    public OneToOneStrategyDescriptor() { }

}
