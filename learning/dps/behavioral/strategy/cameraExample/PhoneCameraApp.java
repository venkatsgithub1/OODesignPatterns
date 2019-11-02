package learning.dps.behavioral.strategy.cameraExample;

public abstract class PhoneCameraApp {

    ShareStrategy shareStrategy;

    public void take() {
        System.out.println("taking a picture");
    }

    public void edit() {
        System.out.println("editing a picture");
    }

    public void save() {
        System.out.println("saving a picture to chosen location");
    }

    public abstract void setShareStrategy(ShareStrategy shareStrategy);

    public void share() {
        shareStrategy.share();
    }
}
