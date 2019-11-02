package learning.dps.behavioral.strategy.cameraExample;

public class TakePictures {
    public static void main(String[] args) {
        System.out.println("--Checking basic camera app");
        PhoneCameraApp basic = new BasicCameraApp();
        basic.take();
        basic.save();
        basic.share();

        System.out.println("--Checking camera plus app");
        PhoneCameraApp plus = new CameraPlusApp();
        plus.take();
        plus.save();
        plus.share();
    }
}
