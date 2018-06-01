package pt.isel.ngspipes.pipeline_descriptor.step.exec;

public interface ICommandExecDescriptor extends IExecDescriptor {

    String getToolName();
    void setToolName(String toolName);

    String getCommandName();
    void setCommandName(String commandName);

}
