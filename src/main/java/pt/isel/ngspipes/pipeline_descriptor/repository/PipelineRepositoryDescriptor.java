package pt.isel.ngspipes.pipeline_descriptor.repository;

import pt.isel.ngspipes.pipeline_descriptor.repository.value.IValueDescriptor;

import java.util.Map;

public class PipelineRepositoryDescriptor extends RepositoryDescriptor implements IPipelineRepositoryDescriptor {

    public PipelineRepositoryDescriptor(String id, String location, Map<String, IValueDescriptor> configuration) {
        super(id, location, configuration);
    }

    public PipelineRepositoryDescriptor() {
        super();
    }

}
