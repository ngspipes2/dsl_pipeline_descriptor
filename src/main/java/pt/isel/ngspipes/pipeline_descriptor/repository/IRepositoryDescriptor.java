package pt.isel.ngspipes.pipeline_descriptor.repository;

import pt.isel.ngspipes.pipeline_descriptor.repository.value.IValueDescriptor;

import java.util.Map;

public interface IRepositoryDescriptor {

    String getId();

    String getLocation();

    Map<String, IValueDescriptor> getConfiguration();

}
