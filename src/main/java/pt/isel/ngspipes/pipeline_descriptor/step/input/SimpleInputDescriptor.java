package pt.isel.ngspipes.pipeline_descriptor.step.input;

public class SimpleInputDescriptor extends InputDescriptor implements ISimpleInputDescriptor {

    private Object value;
    @Override public Object getValue() { return this.value; }
    public void setValue(Object value) { this.value = value; }



    public SimpleInputDescriptor(String inputName, Object value) {
        super(inputName);
        this.value = value;
    }

    public SimpleInputDescriptor(Object value) { }

}
