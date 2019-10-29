package learning.dps.behavioral.strategy.cameraExample.before;

public class Email implements ShareStrategy {
    @Override
    public void share() {
        new Text().share();
        System.out.println("Sharing picture over Email");
    }
}
