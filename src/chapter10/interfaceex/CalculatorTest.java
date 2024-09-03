package chapter10.interfaceex;

public class CalculatorTest {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        Calc calc = new CompleteCalc();
        Calc calc1 = new CompleteCalc();
        Calc calc2 = new CompleteCalc();
        calc.add(num1, num2);

        System.out.println(calc.add(num1, num2));

        calc.description();

        int[] arr = {1,2,3,4,5};
        int sum = Calc.total(arr);

        System.out.println(sum);


    }
}
