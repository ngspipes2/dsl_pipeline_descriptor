package pt.isel.ngspipes.pipeline_descriptor.repository;

import pt.isel.ngspipes.pipeline_descriptor.repository.value.IValueDescriptor;

import java.util.Map;

public class RepositoryDescriptor implements IRepositoryDescriptor {

    private String id;
    @Override public String getId() { return this.id; }
    public void setId(String id) { this.id = id; }

    private String location;
    @Override public String getLocation() { return this.location; }
    public void setLocation(String location) { this.location = location; }

    private Map<String, IValueDescriptor> configuration;
    @Override public Map<String, IValueDescriptor> getConfiguration() { return this.configuration; }
    public void setConfiguration(Map<String, IValueDescriptor> configuration) { this.configuration = configuration; }



    public RepositoryDescriptor(String id, String location, Map<String, IValueDescriptor> configuration) {
        this.id = id;
        this.location = location;
        this.configuration = configuration;
    }

    public RepositoryDescriptor() { }

}
