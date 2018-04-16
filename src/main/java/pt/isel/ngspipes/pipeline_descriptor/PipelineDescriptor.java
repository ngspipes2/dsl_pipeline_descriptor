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

    private String logo;
    @Override public String getLogo() { return this.logo; }
    public void setLogo(String logo) { this.logo = logo; }

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
        String logo,
        Collection<IParameterDescriptor> parameters,
        Collection<IOutputDescriptor> outputs,
        Collection<IRepositoryDescriptor> repositories,
        Collection<IStepDescriptor> steps) {
        this.name = name;
        this.logo = logo;
        this.parameters = parameters;
        this.outputs = outputs;
        this.repositories = repositories;
        this.steps = steps;
    }

    public PipelineDescriptor(){}

}
