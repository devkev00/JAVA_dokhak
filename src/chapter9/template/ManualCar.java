package chapter9.template;

public class ManualCar extends Car {
    @Override
    public void drive() {
        System.out.println("Manual car driving");

    }

    @Override
    public void stop() {
        System.out.println("Manual car stopping");

    }

    @Override
    public void wiper() {
        System.out.println("막내야 와이퍼 켜야지");
    }
}
