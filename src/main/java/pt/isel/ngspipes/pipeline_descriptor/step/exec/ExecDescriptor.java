package pt.isel.ngspipes.pipeline_descriptor.step.exec;

public class ExecDescriptor implements IExecDescriptor {

    private String repositoryId;
    @Override public String getRepositoryId() { return this.repositoryId; }
    public void setRepositoryId(String repositoryId) { this.repositoryId = repositoryId; }



    public ExecDescriptor(String repositoryId) {
        this.repositoryId = repositoryId;
    }

    public ExecDescriptor() { }

}
