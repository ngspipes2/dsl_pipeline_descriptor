package pt.isel.ngspipes.pipeline_descriptor.step.exec;

public class PipelineExecDescriptor extends ExecDescriptor implements IPipelineExecDescriptor {

    private String pipelineName;
    @Override public String getPipelineName() { return this.pipelineName; }
    @Override public void setPipelineName(String pipelineName) { this.pipelineName = pipelineName; }



    public PipelineExecDescriptor(String repositoryId, String pipelineName) {
        super(repositoryId);
        this.pipelineName = pipelineName;
    }

    public PipelineExecDescriptor() { }

}
