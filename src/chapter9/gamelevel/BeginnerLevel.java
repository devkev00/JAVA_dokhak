package chapter9.gamelevel;

public class BeginnerLevel extends PlayerLevel {
    @Override
    public void run() {
        System.out.println("천천히 달립니다.");
    }

    @Override
    public void jump() {
        System.out.println("아직 허접이라 jump못함");

    }

    @Override
    public void turn() {
        System.out.println("아직 허접이라 turn못함");

    }

    @Override
    public void showLevelMessage() {
        System.out.println("======초보자 레벨입니다======");

    }

}
