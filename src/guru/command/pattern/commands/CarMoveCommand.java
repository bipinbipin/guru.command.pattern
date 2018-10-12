package guru.command.pattern.commands;

import guru.command.pattern.Car;
import guru.command.pattern.commands.CommandBase;

public class CarMoveCommand implements CommandBase {
    private Car car;
    public CarMoveCommand(Car car){
        this.car=car;
    }
    @Override
    public void execute(){
        System.out.println("CarMoveCommand.execute(): Invoking move() on Car");
        car.move();
    }
    @Override
    public void undo(){
        System.out.println("CarMoveCommand.undo():  Undoing previous action->Invoking stop() on Car");
        car.stop();

    }
}