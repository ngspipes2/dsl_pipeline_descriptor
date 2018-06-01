package pt.isel.ngspipes.pipeline_descriptor.step.exec;

public class CommandExecDescriptor extends ExecDescriptor  implements ICommandExecDescriptor {

    private String toolName;
    @Override public String getToolName() { return this.toolName; }
    @Override public void setToolName(String toolName) { this.toolName = toolName; }

    private String commandName;
    @Override public String getCommandName() { return this.commandName; }
    @Override public void setCommandName(String commandName) { this.commandName = commandName; }



    public CommandExecDescriptor(String repositoryId, String toolName, String commandName) {
        super(repositoryId);
        this.toolName = toolName;
        this.commandName = commandName;
    }

    public void setCommandName() { }

}
