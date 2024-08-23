package chapter5;

public class StudentTest {
    public static void main(String[] args) { // Student에서 만든 클래스를 StudentTest 클래스에서 메인 메서드에 넣어서 활용
        Student studentLee = new Student();
        studentLee.studentName = "이순신";
        studentLee.address = "천안시 동남구 문화동";

        studentLee.showStudentInfo();
    }
}
