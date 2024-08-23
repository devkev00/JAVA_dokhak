package chapter5.hiding;

import jdk.jfr.Frequency;

class Birthday {

    private int day;
    private int month;
    private int year; // private은 클래스 안에서만 사용 가능

    public int getDay() { // private으로 설정된 class 내부 필드들을, public 메서드를 통해 접근
        return day;
    }

    public void setDay(int day) {
        if (month == 2) {
            if (day < 1 || day > 28) {
                System.out.println("날짜 오류입니다.");
            }
        }
        this.day = day;
    }

    public int getMonth() {
        return month;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

}

public class BirthdayTest {

    public static void main(String[] args) {
        Birthday day = new Birthday();

        day.setMonth(2);
        day.setDay(30);
        day.setYear(2000);

    }

}