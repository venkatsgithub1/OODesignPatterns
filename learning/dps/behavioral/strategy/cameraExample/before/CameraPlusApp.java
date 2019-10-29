package learning.dps.behavioral.strategy.cameraExample.before;

public class CameraPlusApp extends PhoneCameraApp {

    CameraPlusApp() {
        setShareStrategy(new Social());
    }

    @Override
    public void edit() {
        System.out.println("editing Picture using ADVANCED features");
    }

    @Override
    public void setShareStrategy(ShareStrategy shareStrategy) {
        this.shareStrategy = shareStrategy;
    }
}
