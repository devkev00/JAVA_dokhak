package chapter6.corporation;

public class TakeBusAndTrain {
    public static void main(String[] args) {

        Student kevin = new Student("Kevin", 5000);
        Student chaewon = new Student("Chaewon", 10000);

        Bus bus100 = new Bus(100);
        kevin.takeBus(bus100);
        kevin.showInfo();
        bus100.showInfo();

        Subway subway1 = new Subway(1);
        chaewon.takeSubway(subway1);
        chaewon.showInfo();
        subway1.showInfo();

    }
}
