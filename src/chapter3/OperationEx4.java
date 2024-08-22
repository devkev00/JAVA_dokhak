package chapter3;

public class OperationEx4 {
    public static void main(String[] args) {
        int num1 = 10;
        System.out.println(num1 += 1); // 11

        System.out.println(num1 %= 10); // 1
        num1 -= 1; //num1 = num1 - 1;
        System.out.println(num1); // 0

        int num = (5 > 3) ? 10 : 20; // 괄호 안이 true면 콜론 왼쪽값, 괄호 안이 false면 콜론 오른쪽값이 할당됨
        System.out.println(num);
    }
}
