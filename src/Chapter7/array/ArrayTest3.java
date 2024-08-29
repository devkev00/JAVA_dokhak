package Chapter7.array;

public class ArrayTest3 {
    public static void main(String[] args) {

        char[] alphabets = new char[26];
        char ch = 'A'; // 65 (아스키)

        for (int i = 0; i < alphabets.length; i++, ch++) { // ch++ -> 자동으로 다음 알파벳이 됨(아스키 변환)
            alphabets[i] = ch;
        }

        for (int i = 0; i < alphabets.length; i++) {
            System.out.println(alphabets[i]);
        }
    }
}
