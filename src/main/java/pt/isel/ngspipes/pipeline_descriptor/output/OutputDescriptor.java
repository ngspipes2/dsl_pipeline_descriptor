package pt.isel.ngspipes.pipeline_descriptor.output;

public class OutputDescriptor implements IOutputDescriptor {

    private String name;
    @Override public String getName() { return this.name; }
    @Override public void setName(String name) { this.name = name; }

    private String stepId;
    @Override public String getStepId() { return this.stepId; }
    @Override public void setStepId(String stepId) { this.stepId = stepId; }

    private String outputName;
    @Override public String getOutputName() { return this.outputName; }
    @Override public void setOutputName(String outputName) { this.outputName = outputName; }



    public OutputDescriptor(String name, String stepId, String outputName) {
        this.name = name;
        this.stepId = stepId;
        this.outputName = outputName;
    }

    public OutputDescriptor() { }

}
