package chapter2;

public class Constant {

    public static void main(String[] args) {
        final int MAX_NUM = 100; // 상수는 대문자로 쓴다 관용적으로
        final double PI = 3.14f; // 상수는 값이 변할 수 없다! -> 한번 선언 후 여러 곳에서 활용 가능(수정 용이)

        // PI = 3.15; //다시 할당하려고 하면 오류 발생
        final int STUDENT_NUM = 31;

        int num = 0;
        if (num == STUDENT_NUM) {
            System.out.println(STUDENT_NUM);
        } else {
            System.out.println("False");
        }

    }
}
