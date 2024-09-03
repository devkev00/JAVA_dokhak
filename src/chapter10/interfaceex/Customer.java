package chapter10.interfaceex;

public class Customer implements Buy, Sell{

    @Override
    public void buy() {
        System.out.println("buy");

    }

    @Override
    public void Order() {
        System.out.println("Customer Order");
    }

    @Override
    public void sell() {
        System.out.println("sell");

    }
}
