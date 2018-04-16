package pt.isel.ngspipes.pipeline_descriptor.step.spread;

import pt.isel.ngspipes.pipeline_descriptor.step.spread.strategyDescriptor.ICombineStrategyDescriptor;

import java.util.Collection;

public class SpreadDescriptor implements ISpreadDescriptor {

    private Collection<String> inputsToSpread;
    @Override public Collection<String> getInputsToSpread() { return this.inputsToSpread; }
    public void setInputsToSpread(Collection<String> inputsToSpread) { this.inputsToSpread = inputsToSpread; }

    private ICombineStrategyDescriptor strategy;
    @Override public ICombineStrategyDescriptor getStrategy() { return this.strategy; }
    public void setStrategy(ICombineStrategyDescriptor strategy) { this.strategy = strategy; }



    public SpreadDescriptor(Collection<String> inputsToSpread, ICombineStrategyDescriptor strategy) {
        this.inputsToSpread = inputsToSpread;
        this.strategy = strategy;
    }

    public SpreadDescriptor() { }

}
