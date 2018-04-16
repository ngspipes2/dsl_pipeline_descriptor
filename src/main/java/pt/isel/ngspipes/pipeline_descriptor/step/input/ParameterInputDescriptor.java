package pt.isel.ngspipes.pipeline_descriptor.step.input;

public class ParameterInputDescriptor extends InputDescriptor implements IParameterInputDescriptor {

    private String parameterName;
    @Override public String getParameterName() { return this.parameterName; }
    public void setParameterName(String parameterName) { this.parameterName = parameterName; }



    public ParameterInputDescriptor(String inputName, String parameterName) {
        super(inputName);
        this.parameterName = parameterName;
    }

    public ParameterInputDescriptor() { }

}
