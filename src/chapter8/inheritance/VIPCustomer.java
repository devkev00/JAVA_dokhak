package chapter8.inheritance;

public class VIPCustomer extends Customer {

    private int agentID;
    private double salesRatio;

    public VIPCustomer(int customerID, String customerName, int agentID) {
        super(customerID, customerName);
        customerGrade = "VIP";
        bonusRatio = 0.05;
        salesRatio = 0.1;
        this.agentID = agentID;

//        System.out.println("VIP customer(int, String)) created");

    }

    // 메서드 오버라이딩
    // Customer의 calcPrice와 차별성을 두기 위함
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio; // price에 vip의 보너스 배율을 적용
        return price - (int)(price * salesRatio); // price에 vip의 할인율을 적용
    }

    public int getAgentID() {
        return agentID;
    }

}
