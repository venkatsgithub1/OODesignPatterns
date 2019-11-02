package learning.dps.behavioral.strategy.cameraExample;

public class BasicCameraApp extends PhoneCameraApp {

    BasicCameraApp() {
        setShareStrategy(new Email());
    }

    @Override
    public void edit() {
        System.out.println("editing the app using basic features");
    }

    @Override
    public void setShareStrategy(ShareStrategy shareStrategy) {
        this.shareStrategy = shareStrategy;
    }
}
