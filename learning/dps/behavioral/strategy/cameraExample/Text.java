package learning.dps.behavioral.strategy.cameraExample;

public class Text implements ShareStrategy {
    @Override
    public void share() {
        System.out.println("Share picture over text message");
    }
}
