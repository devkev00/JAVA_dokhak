package chapter3;

public class OperationEx5 {
    public static void main(String[] args) {
        int num1 = 5; // 0000 0101
        int num2 = 10; // 0000 1010

        int result = num1 & num2; // 둘 다 1이어야 1 -> 0000 0000
        System.out.println(result); // 0

        int num3 = 5;
        System.out.println(num3 <<= 1); // 비트 연산자, 왼쪽으로 한칸 -> 원래 수 * 2의 '칸'승
    }
}
