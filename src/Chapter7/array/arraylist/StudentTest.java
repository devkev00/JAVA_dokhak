package Chapter7.array.arraylist;

public class StudentTest {
    public static void main(String[] args) {

        Student studentLee = new Student(1001, "Lee");
        studentLee.addSubject("국어", 100);
        studentLee.addSubject("수학", 95);

        studentLee.showStudentInfo();

        System.out.println("================");

        Student studentKim = new Student(1002, "Kim");
        studentKim.addSubject("국어", 100);
        studentKim.addSubject("수학", 95);
        studentKim.addSubject("영어", 85);

        studentKim.showStudentInfo();

    }
}
