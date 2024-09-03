package chapter10.interfaceex;

public interface Calc {

    double PI = 3.14;
    int ERROR = -999999999;

    int add(int num1, int num2);
    int substract(int num1, int num2);
    int times(int num1, int num2);
    int divide(int num1, int num2);

    default void description() { // 디폴트 메서드
        System.out.println("정수 계산기를 구현합니다");
    }

    static int total(int[] arr) { // 정적 메서드
        int total = 0;

        for (int i : arr) {
            total += i;
        }
        return total;
    }
}
