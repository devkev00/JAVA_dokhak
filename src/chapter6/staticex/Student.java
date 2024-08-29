package chapter6.staticex;

public class Student {

    private static int serialNum = 10000;
    int studentID;
    String studentName;

    public Student() { // 커스텀 생성자 -> 객체(인스턴스)가 생성될 때 수행할 동작을 정의
        serialNum++;
        studentID = serialNum;
    }

    public static int getSerialNum() { // 스태틱 메서드

        // studentName = "rlaalstn"; // 멤버 변수, 인스턴스 변수 사용 불가

        return serialNum; // static 변수, 클래스 변수
    }

}
