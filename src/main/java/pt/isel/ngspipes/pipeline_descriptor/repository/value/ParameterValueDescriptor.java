package pt.isel.ngspipes.pipeline_descriptor.repository.value;

public class ParameterValueDescriptor extends ValueDescriptor implements IParameterValueDescriptor {

    private String parameterName;
    @Override public String getParameterName() { return this.parameterName; }
    @Override public void setParameterName(String parameterName) { this.parameterName = parameterName; }



    public ParameterValueDescriptor(String parameterName) {
        this.parameterName = parameterName;
    }

    public ParameterValueDescriptor() { }

}
