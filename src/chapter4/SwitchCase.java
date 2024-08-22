package chapter4;

public class SwitchCase {
    public static void main(String[] args) {
        int rank = 1;
        char medalColor;

        switch (rank) {
            case 1: medalColor = 'G';
                break; //break가 있는 시점에서 수행을 하고 switch문을 탈출하기 때문에 필수임

            case 2: medalColor = 'S';
                break;

            case 3: medalColor = 'B';
                break;

            default: medalColor = 'A';

        }
        System.out.println(rank + "등 메달의 색깔은 " + medalColor + "입니다.");
    }
}
