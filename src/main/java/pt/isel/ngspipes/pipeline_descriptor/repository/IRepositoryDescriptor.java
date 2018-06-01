package pt.isel.ngspipes.pipeline_descriptor.repository;

import pt.isel.ngspipes.pipeline_descriptor.repository.value.IValueDescriptor;

import java.util.Map;

public interface IRepositoryDescriptor {

    String getId();
    void setId(String id);

    String getLocation();
    void setLocation(String location);

    Map<String, IValueDescriptor> getConfiguration();
    void setConfiguration(Map<String, IValueDescriptor> configuration);

}
