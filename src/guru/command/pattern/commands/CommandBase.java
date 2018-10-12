package guru.command.pattern.commands;

public interface CommandBase {
    void execute();
    void undo();
}