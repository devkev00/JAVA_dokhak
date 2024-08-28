package chapter6.corporation;

public class Subway {
    int lineNumber;
    int passengerCount;
    int money;

    public Subway(int lineNumber) {
        this.lineNumber = lineNumber;

    }

    public void take(int money) {
        passengerCount++;
        this.money += money;
    }

    public void showInfo() {
        System.out.println("호선: " + lineNumber + " 승객 수: " + passengerCount + " 수입: " + money);
    }
}
