package chapter8.inheritance;

public class VIPCustomer extends Customer {

    private int agentID;
    private double salesRatio;

    public VIPCustomer() {
        customerGrade = "VIP";
        bonusRatio = 0.05;
        salesRatio = 0.1;

    }

    public int getAgentID() {
        return agentID;
    }

}
