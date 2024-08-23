package chapter5;

public class Student { // public을 가지는 클래스는 하나, 클래스명과 자바 파일명은 동일해야 함
    int studentID;
    String studentName;
    int grade;
    String address;

    public Student () {} // 디폴트 생성자

    public Student (int id, String name, int grade, String address) {
        studentID = id;
        studentName = name;
        this.grade = grade;
        this.address = address;
    }

    public void showStudentInfo() {
        System.out.println(studentName + ", " + address);
    }

    public String getStudentName() { // 학생 이름을 반환하는 메서드 생성
        return studentName;
    }

    public void setStudentName(String name) {
        studentName = name;
    }

    public static void main(String[] args) {

        Student studentLee = new Student();
        studentLee.studentName = "이민수";
        studentLee.studentID = 100;
        studentLee.grade = 90;
        studentLee.address = "호두과자나라";

        Student studentKim = new Student();
        studentKim.studentName = "김민수";
        studentKim.studentID = 100;
        studentKim.grade = 90;
        studentKim.address = "계란과자나라";

        studentLee.showStudentInfo();
        studentKim.showStudentInfo();

        System.out.println(studentLee);
        System.out.println(studentKim);
    }
}