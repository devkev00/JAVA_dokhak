package chapter3;

public class OperationEx2 {
    public static void main(String[] args) {
        int num = 10;
        System.out.println(num++); //num이 출력된 후 1 더해짐
        System.out.println(num); //11
        System.out.println(3>5); // false
        System.out.println(3<5); // true

        int num1 = 10;
        int num2 = 5;
        boolean flag = (num1 > num2);
        System.out.println(flag); // True
    }
}
