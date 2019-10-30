package by.andersen.kudko.command.commandobject;

import by.andersen.kudko.command.Command;
import by.andersen.kudko.command.Light;

public class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
