package by.andersen.kudko.command.commandobject;

import by.andersen.kudko.command.Command;
import by.andersen.kudko.command.GarageDoor;

public class GarageDorrOpenCommand implements Command {
    GarageDoor garageDoor;

    public GarageDorrOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
        garageDoor.lightOn();
    }
}
