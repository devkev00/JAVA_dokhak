package chapter2;

public class VariableEx2 {
    public static void main(String[] args) {
//        long num = 12345678900; long이어도 오류 발생

        long num = 12345678900L; // 식별자 L(long) -> 이 숫자를 8바이트로 저장해라(오류 사라짐)

    }
}
