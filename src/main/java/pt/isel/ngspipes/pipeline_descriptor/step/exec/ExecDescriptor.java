package pt.isel.ngspipes.pipeline_descriptor.step.exec;

public abstract class ExecDescriptor implements IExecDescriptor {

    private String repositoryId;
    @Override public String getRepositoryId() { return this.repositoryId; }
    @Override public void setRepositoryId(String repositoryId) { this.repositoryId = repositoryId; }



    public ExecDescriptor(String repositoryId) {
        this.repositoryId = repositoryId;
    }

    public ExecDescriptor() { }

}
