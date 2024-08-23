package chapter5;

public class FunctionTest {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 30;

        int sum = addNum(num1, num2); // num1, num2를 인자로 받아서 addNum 함수를 실행
        System.out.println(sum);
    }

    public static int addNum(int n1, int n2) { // 함수, 매개변수
        int result = n1 + n2;
        return result;
    }
}
