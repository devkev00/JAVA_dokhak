package Chapter7.array;

public class twoDimensionArray {
    public static void main(String[] args) {

        int[][] arr = {{1,2,3}, {4,5,6}};

//        System.out.println(arr.length); // length는 행의 길이
//        System.out.println(arr[0].length); // length는 0행의 길이 (열의 길이)

        for (int i = 0; i < arr.length; i++) { // 행 순회
            for (int j = 0; j < arr[i].length; j++) { // 행 내부 요소 순회
                System.out.println(arr[i][j]);
            }
        }

        char[][] alphabets = new char[13][2];

        char a = 'A';
        int cnt = 0;

        for (int i = 0; i < alphabets.length; i++) {
            for (int j = 0; j < alphabets[i].length; j++) {
                alphabets[i][j] = a;
                a++;
                System.out.printf(String.valueOf(alphabets[i][j]));
                cnt++;
                if (cnt == 2) {
                    System.out.println();
                    cnt = 0;
                }
            }
        }

    }
}
