package by.andersen.kudko.command;

import by.andersen.kudko.command.commandobject.GarageDorrOpenCommand;
import by.andersen.kudko.command.commandobject.LightOnCommand;

public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remoteControl = new SimpleRemoteControl();
        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor();
        LightOnCommand lightOn = new LightOnCommand(light);
        GarageDorrOpenCommand garageOpen = new GarageDorrOpenCommand(garageDoor);

        remoteControl.setCommand(lightOn);
        remoteControl.pushTheButton();
        remoteControl.setCommand(garageOpen);
        remoteControl.pushTheButton();

    }
}
