package chapter2;

public class ExpilcitConversion { // 명시적 형변환
    public static void main(String[] args) {
        int iNum = 1000;
        byte bNum = (byte)iNum;

        System.out.println(iNum);
        System.out.println(bNum); // 잘못된 값, 큰 수를 작은 수로 대입하니까 데이터가 유실된 것

        double dNum = 3.14;
        iNum = (int)dNum;

        System.out.println(iNum); //3.14를 정수로 형변환 했기에 3이 됨

        float fNum = 0.9F;

        int num1 = (int)dNum + (int)fNum; // 3
        int num2 = (int)(dNum + fNum); // 4

        System.out.println(num1);
        System.out.println(num2);

    }
}
