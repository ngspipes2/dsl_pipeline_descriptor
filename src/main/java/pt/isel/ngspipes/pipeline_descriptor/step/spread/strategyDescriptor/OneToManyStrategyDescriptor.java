package pt.isel.ngspipes.pipeline_descriptor.step.spread.strategyDescriptor;

public class OneToManyStrategyDescriptor extends CombineStrategyDescriptor implements IOneToManyStrategyDescriptor {

    public OneToManyStrategyDescriptor(IStrategyDescriptor firstStrategy, IStrategyDescriptor secondStrategy) {
        super(firstStrategy, secondStrategy);
    }

    public OneToManyStrategyDescriptor() { }

}
