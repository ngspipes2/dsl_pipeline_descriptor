package pt.isel.ngspipes.pipeline_descriptor.step;

import pt.isel.ngspipes.pipeline_descriptor.repository.value.IValueDescriptor;
import pt.isel.ngspipes.pipeline_descriptor.step.exec.IExecDescriptor;
import pt.isel.ngspipes.pipeline_descriptor.step.input.IInputDescriptor;
import pt.isel.ngspipes.pipeline_descriptor.step.spread.ISpreadDescriptor;

import java.util.Collection;

public interface IStepDescriptor {

    String getId();
    void setId(String id);

    IExecDescriptor getExec();
    void setExec(IExecDescriptor exec);

    IValueDescriptor getExecutionContext();
    void setExecutionContext(IValueDescriptor executionContext);

    Collection<IInputDescriptor> getInputs();
    void setInputs(Collection<IInputDescriptor> inputs);

    ISpreadDescriptor getSpread();
    void setSpread(ISpreadDescriptor spread);

}
