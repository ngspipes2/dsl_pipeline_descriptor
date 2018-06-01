package pt.isel.ngspipes.pipeline_descriptor.step.input;

public class ChainInputDescriptor extends InputDescriptor implements IChainInputDescriptor {

    private String stepId;
    @Override public String getStepId() { return this.stepId; }
    @Override public void setStepId(String stepId) { this.stepId = stepId; }

    private String outputName;
    @Override public String getOutputName() { return this.outputName; }
    @Override public void setOutputName(String outputName) { this.outputName = outputName; }



    public ChainInputDescriptor(String inputName, String stepId, String outputName) {
        super(inputName);
        this.stepId = stepId;
        this.outputName = outputName;
    }

    public ChainInputDescriptor() { }

}
