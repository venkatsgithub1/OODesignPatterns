package learning.dps.behavioral.strategy.cameraExample.before;

public class Social implements ShareStrategy {
    @Override
    public void share() {
        new Text().share();
        new Email().share();
        System.out.println("Share picture in social media: Facebook, Twitter, Instagram, Pinterest etc");
    }
}
