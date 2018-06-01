package pt.isel.ngspipes.pipeline_descriptor.step.input;

public interface IChainInputDescriptor extends IInputDescriptor {

    String getStepId();
    void setStepId(String stepId);

    String getOutputName();
    void setOutputName(String outputName);

}
