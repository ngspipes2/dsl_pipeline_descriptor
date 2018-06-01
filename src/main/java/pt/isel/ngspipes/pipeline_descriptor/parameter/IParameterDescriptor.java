package pt.isel.ngspipes.pipeline_descriptor.parameter;

public interface IParameterDescriptor {

    String getName();
    void setName(String name);

    Object getDefaultValue();
    void setDefaultValue(Object defaultValue);

}
