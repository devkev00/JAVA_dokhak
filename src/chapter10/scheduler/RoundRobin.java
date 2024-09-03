package chapter10.scheduler;

public class RoundRobin implements Scheduler {

    @Override
    public void getNextCall() { // 추상 메서드의 구체화(구현)!!
        System.out.println("상담 전화를 순서대로 대기열에서 가져옵니다.");

    }

    @Override
    public void sendCallToAgent() {
        System.out.println("다음 순서 상담원에게 배분합니다.");

    }
}
