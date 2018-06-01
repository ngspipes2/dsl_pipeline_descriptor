package pt.isel.ngspipes.pipeline_descriptor.repository.value;

public interface IParameterValueDescriptor extends IValueDescriptor {

    String getParameterName();
    void setParameterName(String parameterName);

}
