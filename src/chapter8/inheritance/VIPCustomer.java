package chapter8.inheritance;

public class VIPCustomer extends Customer {

    private int agentID;
    private double salesRatio;

    public VIPCustomer(int customerID, String customerName) {
        super(customerID, customerName);
        customerGrade = "VIP";
        bonusRatio = 0.05;
        salesRatio = 0.1;

        System.out.println("VIP customer(int, String)) created");

    }

    public int getAgentID() {
        return agentID;
    }

}
