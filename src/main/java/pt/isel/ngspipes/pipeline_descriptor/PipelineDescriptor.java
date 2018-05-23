package pt.isel.ngspipes.pipeline_descriptor;

import pt.isel.ngspipes.pipeline_descriptor.output.IOutputDescriptor;
import pt.isel.ngspipes.pipeline_descriptor.parameter.IParameterDescriptor;
import pt.isel.ngspipes.pipeline_descriptor.repository.IRepositoryDescriptor;
import pt.isel.ngspipes.pipeline_descriptor.step.IStepDescriptor;

import java.util.Collection;

public class PipelineDescriptor implements IPipelineDescriptor {

    private String name;
    @Override public String getName() { return this.name; }
    public void setName(String name) { this.name = name; }

    private String description;
    @Override public String getDescription() { return this.description; }
    public void setDescription(String description) { this.description = description; }

    private String author;
    @Override public String getAuthor() { return this.author; }
    public void setAuthor(String author) { this.author = author; }

    private String version;
    @Override public String getVersion(){ return this.version; }
    public void setVersion(String version){ this.version = version; }

    private Collection<String> documentation;
    @Override public Collection<String> getDocumentation(){ return this.documentation; }
    public void setDocumentation(Collection<String> documentation){ this.documentation = documentation; }

    private byte[] logo;
    @Override public byte[] getLogo() { return this.logo; }
    public void setLogo(byte[] logo) { this.logo = logo; }

    private Collection<IParameterDescriptor> parameters;
    @Override public Collection<IParameterDescriptor> getParameters() { return this.parameters; }
    public void setParameters(Collection<IParameterDescriptor> parameters) { this.parameters = parameters; }

    private Collection<IOutputDescriptor> outputs;
    @Override public Collection<IOutputDescriptor> getOutputs() { return this.outputs; }
    public void setOutputs(Collection<IOutputDescriptor> outputs) { this.outputs = outputs; }

    private Collection<IRepositoryDescriptor> repositories;
    @Override public Collection<IRepositoryDescriptor> getRepositories() { return this.repositories; }
    public void setRepositories(Collection<IRepositoryDescriptor> repositories) { this.repositories = repositories; }

    private Collection<IStepDescriptor> steps;
    @Override public Collection<IStepDescriptor> getSteps() { return this.steps; }
    public void setSteps(Collection<IStepDescriptor> steps) { this.steps = steps; }



    public PipelineDescriptor(
        String name,
        String description,
        String author,
        String version,
        Collection<String> documentation,
        byte[] logo,
        Collection<IParameterDescriptor> parameters,
        Collection<IOutputDescriptor> outputs,
        Collection<IRepositoryDescriptor> repositories,
        Collection<IStepDescriptor> steps) {
        this.name = name;
        this.description = description;
        this.author= author;
        this.version = version;
        this.documentation = documentation;
        this.logo = logo;
        this.parameters = parameters;
        this.outputs = outputs;
        this.repositories = repositories;
        this.steps = steps;
    }

    public PipelineDescriptor(){}

}
