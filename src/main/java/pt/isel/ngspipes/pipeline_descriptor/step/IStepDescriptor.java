package pt.isel.ngspipes.pipeline_descriptor.step;

import pt.isel.ngspipes.pipeline_descriptor.step.exec.IExecDescriptor;
import pt.isel.ngspipes.pipeline_descriptor.step.input.IInputDescriptor;
import pt.isel.ngspipes.pipeline_descriptor.step.spread.ISpreadDescriptor;
import pt.isel.ngspipes.pipeline_descriptor.repository.value.IValueDescriptor;

import java.util.Collection;

public interface IStepDescriptor {

    IExecDescriptor getExec();

    IValueDescriptor getExecutionContext();

    Collection<IInputDescriptor> getInputs();

    ISpreadDescriptor getSpread();

}