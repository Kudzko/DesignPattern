package by.andersen.kudko.command;

public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl() {
    }

    public void setCommand(Command command){
        slot = command;
    }

    public void pushTheButton(){
        slot.execute();
    }
}
