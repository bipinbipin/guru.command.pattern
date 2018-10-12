package guru.command.pattern.commands;

import guru.command.pattern.RotatingTop;
import guru.command.pattern.commands.CommandBase;

public class TopStopRotateCommand implements CommandBase {
    RotatingTop rotatingTop;
    public TopStopRotateCommand(RotatingTop rotatingTop){
        this.rotatingTop=rotatingTop;
    }
    @Override
    public void execute(){
        System.out.println("TopStopRotateCommand.execute(): Invoking stopRotating() on RotatingTop");
        rotatingTop.stopRotating();
    }
    @Override
    public void undo(){
        System.out.println("TopStopRotateCommand.undo(): Undoing previous action->Invoking startRotating() on RotatingTop");
        rotatingTop.startRotating();
    }
}