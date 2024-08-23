package chapter5.reference;

import chapter5.reference.Student;

public class StudentTest {
    public static void main(String[] args) {

        Student studentJames = new Student(100, "James");
        studentJames.setKorea(100);
        studentJames.setMath(100);

        Student studentTom = new Student(101, "Tom");
        studentTom.setKorea(50);
        studentTom.setMath(80);

        studentJames.showStudentInfo();
        studentTom.showStudentInfo();

    }
}
