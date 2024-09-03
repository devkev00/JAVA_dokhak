package chapter9.template;

public abstract class Car {

    public abstract void drive();
    public abstract void stop();
    public abstract void wiper();
    public void washCar() {} // 훅 메서드


    public void startCar() {
        System.out.println("start");
    }

    public void turnOff() {
        System.out.println("stop");
    }

    public final void run() { // 템플릿 메서드
        startCar();
        drive();
        wiper();
        stop();
        washCar();
        turnOff();
    }
}
