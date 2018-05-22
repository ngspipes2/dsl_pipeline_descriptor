package pt.isel.ngspipes.pipeline_descriptor.repository;

import pt.isel.ngspipes.pipeline_descriptor.repository.value.IValueDescriptor;

import java.util.Map;

public class ToolRepositoryDescriptor extends RepositoryDescriptor implements IToolRepositoryDescriptor {

    public ToolRepositoryDescriptor(String id, String location, Map<String, IValueDescriptor> configuration) {
        super(id, location, configuration);
    }

    public ToolRepositoryDescriptor() {
        super();
    }

}
