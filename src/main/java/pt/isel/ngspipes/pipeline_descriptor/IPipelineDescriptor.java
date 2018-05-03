package pt.isel.ngspipes.pipeline_descriptor;

import pt.isel.ngspipes.pipeline_descriptor.output.IOutputDescriptor;
import pt.isel.ngspipes.pipeline_descriptor.parameter.IParameterDescriptor;
import pt.isel.ngspipes.pipeline_descriptor.repository.IRepositoryDescriptor;
import pt.isel.ngspipes.pipeline_descriptor.step.IStepDescriptor;

import java.util.Collection;

public interface IPipelineDescriptor {

    String getName();

    String getAuthor();

    String getDescription();

    String getVersion();

    Collection<String> getDocumentation();

    String getLogo();

    Collection<IParameterDescriptor> getParameters();

    Collection<IOutputDescriptor> getOutputs();

    Collection<IRepositoryDescriptor> getRepositories();

    Collection<IStepDescriptor> getSteps();

}
