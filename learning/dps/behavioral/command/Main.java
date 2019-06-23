package learning.dps.behavioral.command;

public class Main {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();

        remote.setCommand(new LightOnCommand(new Light()));
        remote.pressButton();

        remote.setCommand(new StereoOnWithCDCommand(new Stereo()));
        remote.pressButton();
    }
}
