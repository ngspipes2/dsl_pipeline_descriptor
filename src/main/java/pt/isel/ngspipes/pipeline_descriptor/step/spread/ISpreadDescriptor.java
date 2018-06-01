package pt.isel.ngspipes.pipeline_descriptor.step.spread;


import pt.isel.ngspipes.pipeline_descriptor.step.spread.strategyDescriptor.ICombineStrategyDescriptor;

import java.util.Collection;

public interface ISpreadDescriptor {

    Collection<String> getInputsToSpread();
    void setInputsToSpread(Collection<String> inputsToSpread);

    ICombineStrategyDescriptor getStrategy();
    void setStrategy(ICombineStrategyDescriptor strategy);

}
