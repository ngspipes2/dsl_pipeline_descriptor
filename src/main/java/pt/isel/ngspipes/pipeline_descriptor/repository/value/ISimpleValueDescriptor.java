package pt.isel.ngspipes.pipeline_descriptor.repository.value;

public interface ISimpleValueDescriptor extends  IValueDescriptor {

    Object getValue();
    void setValue(Object value);

}
