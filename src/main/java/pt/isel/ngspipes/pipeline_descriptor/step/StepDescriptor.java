package pt.isel.ngspipes.pipeline_descriptor.step;

import pt.isel.ngspipes.pipeline_descriptor.repository.value.IValueDescriptor;
import pt.isel.ngspipes.pipeline_descriptor.step.exec.IExecDescriptor;
import pt.isel.ngspipes.pipeline_descriptor.step.input.IInputDescriptor;
import pt.isel.ngspipes.pipeline_descriptor.step.spread.ISpreadDescriptor;

import java.util.Collection;

public class StepDescriptor implements IStepDescriptor {

    private IExecDescriptor exec;
    @Override public IExecDescriptor getExec() { return this.exec; }
    public void setExec(IExecDescriptor  exec) { this.exec = exec; }

    private IValueDescriptor executionContext;
    @Override public IValueDescriptor getExecutionContext() { return this.executionContext; }
    public void setExecutionContext(IValueDescriptor executionContext) { this.executionContext = executionContext; }

    private Collection<IInputDescriptor> inputs;
    @Override public Collection<IInputDescriptor> getInputs() { return this.inputs; }
    public void setInputs(Collection<IInputDescriptor> inputs) { this.inputs = inputs; }

    private ISpreadDescriptor spread;
    @Override public ISpreadDescriptor getSpread() { return this.spread; }
    public void setSpread(ISpreadDescriptor spread) { this.spread = spread; }



    public StepDescriptor(IExecDescriptor exec, IValueDescriptor executionContext, Collection<IInputDescriptor> inputs, ISpreadDescriptor spread) {
        this.exec = exec;
        this.executionContext = executionContext;
        this.inputs = inputs;
        this.spread = spread;
    }

    public StepDescriptor() { }

}
