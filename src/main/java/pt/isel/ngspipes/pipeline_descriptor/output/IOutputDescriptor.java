package pt.isel.ngspipes.pipeline_descriptor.output;

 public interface IOutputDescriptor {

    String getName();
    void setName(String name);

    String getStepId();
    void setStepId(String stepId);
     
    String getOutputName();
    void setOutputName(String outputName);

}
