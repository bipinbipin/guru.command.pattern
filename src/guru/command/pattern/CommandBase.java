package guru.command.pattern;

public interface CommandBase {
    void execute();
    void undo();
}