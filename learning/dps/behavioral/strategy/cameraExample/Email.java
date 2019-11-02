package learning.dps.behavioral.strategy.cameraExample;

public class Email implements ShareStrategy {
    @Override
    public void share() {
        new Text().share();
        System.out.println("Sharing picture over Email");
    }
}
