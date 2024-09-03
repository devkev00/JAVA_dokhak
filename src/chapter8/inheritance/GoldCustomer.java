package chapter8.inheritance;

public class GoldCustomer extends Customer {

    protected int agentID;
    protected double salesRatio;

    public GoldCustomer(int customerID, String customerName, int agentID) {// bonusRatio를 따로 설정해주기 위한 커스텀 생성자
        super(customerID, customerName);
        customerGrade = "GOLD";
        bonusRatio = 0.03;
        salesRatio = 0.05;
        this.agentID = agentID;
    }

    public int calcPrice(int price) {
        bonusPoint += (int)(price * bonusRatio);
        price -= (int)(price * salesRatio);
        return price;
    }

    @Override
    public String showCustomerInfo() {
        return super.showCustomerInfo();
    }
}
