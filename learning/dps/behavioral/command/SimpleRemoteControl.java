package learning.dps.behavioral.command;

public class SimpleRemoteControl {
    Command slot;

    public void setCommand(Command command) {
        this.slot = command;
    }

    public void pressButton() {
        this.slot.execute();
    }
}
