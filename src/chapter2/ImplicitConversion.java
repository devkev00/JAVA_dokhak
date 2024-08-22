package chapter2;

import com.sun.security.jgss.GSSUtil;

public class ImplicitConversion { // 묵시적 형변환, 작은 수에서 큰 수, 덜 정밀한 수에서 더 정밀한 수로 대입되는 경우 자동으로 발생
    public static void main(String[] args) {
        byte bNum = 10;
        int num = bNum;

        System.out.println(num);

        long lNum = 10;
        float fNum = lNum; // 실수로 형변환
        System.out.println(fNum);

        double dNum = fNum + num;
        System.out.println(dNum); // 큰 실수로 형변환
    }
}
