package chapter8.inheritance.witharraylist;

import java.util.ArrayList;

public class CustomerTest {
    public static void main(String[] args) {

        ArrayList<Customer> customerList = new ArrayList<Customer>();

        Customer customerLee = new Customer(10010, "이순신");
        Customer customerShin = new Customer(10011, "신사임당");
        Customer customerHong = new GoldCustomer(10012, "홍길동");
        Customer customerYul = new GoldCustomer(10012, "이율곡");
        VIPCustomer customerKim = new VIPCustomer(10012, "이율곡", 12345);

        customerList.add(customerLee);
        customerList.add(customerShin);
        customerList.add(customerHong);
        customerList.add(customerYul);
        customerList.add(customerKim);

        System.out.println("============================");
        for (Customer customer : customerList) {
            System.out.println(customer.showCustomerInfo());
        }

        System.out.println("============================");
        int price = 10000;
        for (Customer customer : customerList) {
            int cost = customer.calcPrice(price);
            System.out.println(customer.getCustomerName() + "님의 구매 가격은 " + cost + "입니다.");
            System.out.println(customer.showCustomerInfo());
            System.out.println();
        }

    }
}
