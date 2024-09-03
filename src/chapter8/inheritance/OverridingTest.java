package chapter8.inheritance;

public class OverridingTest {
    public static void main(String[] args) {
//        Customer customerLee = new Customer(10010, "LEE");
//        int price = customerLee.calcPrice(10000);
//        System.out.println("지불 금액은 "+ price + "이고, " + customerLee.showCustomerInfo());
//
//        VIPCustomer customerKim = new VIPCustomer(10010, "KIM", 100);
//        price = customerKim.calcPrice(10000);
//        System.out.println("지불 금액은 "+ price + "이고, " + customerKim.showCustomerInfo());


        Customer customerWho = new VIPCustomer(10010, "WHO", 100);
        int price = customerWho.calcPrice(10000); // 이 calcPrice는 VIPCustomer 객체의 메서드임
        System.out.println("지불 금액은 "+ price + "이고, " + customerWho.showCustomerInfo());

        Customer customerGold = new GoldCustomer(10011, "GOLD", 101);
        price = customerGold.calcPrice(10000);
        System.out.println("지불 금액은 "+ price + "이고, " + customerGold.showCustomerInfo());


    }
}
