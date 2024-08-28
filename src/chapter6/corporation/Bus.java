package chapter6.corporation;

public class Bus {
    int busNumber;
    int passengerCount;
    int money;

    public Bus(int busNumber) {
        this.busNumber = busNumber;

    }

    public void take(int money) {
        passengerCount++;
        this.money += money;
    }

    public void showInfo() {
        System.out.println("버스: " + busNumber + " 승객 수: " + passengerCount + " 수입: " + money);
    }
}
