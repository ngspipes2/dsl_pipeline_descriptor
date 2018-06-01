package pt.isel.ngspipes.pipeline_descriptor.parameter;

public class ParameterDescriptor implements IParameterDescriptor {

    private String name;
    @Override public String getName() { return this.name; }
    @Override public void setName(String name) { this.name = name; }

    private Object defaultValue;
    @Override public Object getDefaultValue() { return this.defaultValue; }
    @Override public void setDefaultValue(Object defaultValue) { this.defaultValue = defaultValue; }



    public ParameterDescriptor(String name, Object defaultValue) {
        this.name = name;
        this.defaultValue = defaultValue;
    }

    public ParameterDescriptor() { }

}
