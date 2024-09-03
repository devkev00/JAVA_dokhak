package chapter9.template;

public class AICar extends Car {
    @Override
    public void drive() {
        System.out.println("자율주행");
        System.out.println("한숨잘게요");

    }

    @Override
    public void stop() {
        System.out.println("자율정지");

    }

    @Override
    public void wiper() {
        System.out.println("와이퍼 자동 작동");
    }

    @Override
    public void washCar() {
        System.out.println("일해라 지피티 세차해라");
    }
}
