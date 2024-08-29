package chapter6.singleton;

import java.util.Calendar;

public class Company {

    private static Company instance = new Company(); // 유일한 인스턴스를 생성

    private Company() {} // private 선언으로 외부에서 인스턴스를 생성하는 것을 막음

    // 유일한 인스턴스를 반환하는 public static 메서드
    public static Company getInstance() {

        if (instance == null) { // 예외 처리
            instance = new Company();
        }

        return instance;

    }
}
