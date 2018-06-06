package pt.isel.ngspipes.pipeline_descriptor.step.input;

public abstract class InputDescriptor implements IInputDescriptor {

    private String inputName;
    @Override public String getInputName() { return this.inputName; }
    @Override public void setInputName(String inputName) { this.inputName = inputName; }



    public InputDescriptor(String inputName) {
        this.inputName = inputName;
    }

    public InputDescriptor() { }

}

