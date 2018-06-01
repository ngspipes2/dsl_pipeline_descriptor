package pt.isel.ngspipes.pipeline_descriptor;

import pt.isel.ngspipes.pipeline_descriptor.output.IOutputDescriptor;
import pt.isel.ngspipes.pipeline_descriptor.parameter.IParameterDescriptor;
import pt.isel.ngspipes.pipeline_descriptor.repository.IRepositoryDescriptor;
import pt.isel.ngspipes.pipeline_descriptor.step.IStepDescriptor;

import java.util.Collection;

public interface IPipelineDescriptor {

    String getName();
    void setName(String name);

    String getDescription();
    void setDescription(String description);

    String getAuthor();
    void setAuthor(String author);

    String getVersion();
    void setVersion(String version);

    Collection<String> getDocumentation();
    void setDocumentation(Collection<String> documentation);

    byte[] getLogo();
    void setLogo(byte[] logo);

    Collection<IParameterDescriptor> getParameters();
    void setParameters(Collection<IParameterDescriptor> parameters);

    Collection<IOutputDescriptor> getOutputs();
    void setOutputs(Collection<IOutputDescriptor> outputs);

    Collection<IRepositoryDescriptor> getRepositories();
    void setRepositories(Collection<IRepositoryDescriptor> repositories);
    
    Collection<IStepDescriptor> getSteps();
    void setSteps(Collection<IStepDescriptor> steps);

}
