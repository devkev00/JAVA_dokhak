package chapter6.singleton;

import java.util.Calendar;

public class CompanyTest {
    public static void main(String[] args) {

        Company c1 = Company.getInstance(); // 인스턴스 반환

        Company c2 = Company.getInstance(); // 마찬가지. c1과 c2는 같은 메모리 주소를 갖게 됨

        System.out.println(c1);
        System.out.println(c2);

        Calendar cal = Calendar.getInstance();
        // 싱글톤으로 구현된 자바 유틸 클래스 중 하나, 역시 객체를 생성하는 것이 아닌 인스턴스를 반환받음
        System.out.println(cal.getTime());

    }
}
