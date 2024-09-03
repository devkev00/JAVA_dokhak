package chapter10.interfaceex;

public class CustomerTest {
    public static void main(String[] args) {

        Customer customer = new Customer();

        Buy buyer = customer;
        buyer.buy();

        Sell seller = customer;
        seller.sell();

        customer.Order();
        buyer.Order(); // customer가 할당되었기 때문에, customer에서 오버라이딩된 Order 메서드가 호출된다
        seller.Order();

    }
}
