package chapter6.staticex;

public class StudentTest1 {
    public static void main(String[] args) {

        System.out.println(Student.getSerialNum());

        Student kevin = new Student();
        System.out.println(kevin.getSerialNum()); // 10001

        Student james = new Student();
        System.out.println(james.studentID); // 10002

        System.out.println(Student.getSerialNum());
        System.out.println(Student.getSerialNum());
    }
}
