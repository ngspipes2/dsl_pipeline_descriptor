package pt.isel.ngspipes.pipeline_descriptor.step.spread.strategyDescriptor;

public class InputStrategyDescriptor extends StrategyDescriptor implements IInputStrategyDescriptor {

    private String inputName;
    @Override public String getInputName() { return this.inputName; }
    public void setInputName(String inputName) { this.inputName = inputName; }



    public InputStrategyDescriptor(String inputName) {
        this.inputName = inputName;
    }

    public InputStrategyDescriptor() { }

}
