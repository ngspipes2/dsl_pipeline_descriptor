package pt.isel.ngspipes.pipeline_descriptor.repository.value;

public class SimpleValueDescriptor extends ValueDescriptor implements ISimpleValueDescriptor {

    private Object value;
    @Override public Object getValue() { return this.value; }
    public void setValue(Object value) { this.value = value; }



    public SimpleValueDescriptor(Object value) {
        this.value = value;
    }

    public SimpleValueDescriptor() { }
}
