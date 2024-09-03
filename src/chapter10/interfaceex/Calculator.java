package chapter10.interfaceex;

public abstract class Calculator implements Calc { // 모든 메서드를 구현하지 않아서 추상 클래스가 됨
    public static void main(String[] args) {

    }

    @Override
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int substract(int num1, int num2) {
        return num1 - num2;
    }
}
