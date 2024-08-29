package chapter8.inheritance;

public class CustomerTest1 {
    public static void main(String[] args) {

//        Customer customerLee = new Customer();
//        customerLee.setCustomerID(10100);
//        customerLee.setCustomerName("Lee");


        Customer customerKim = new VIPCustomer(10101, "Kim");
        customerKim.setCustomerID(10101);
        customerKim.setCustomerName("Kim");


//        System.out.println(customerLee.showCustomerInfo());
        System.out.println(customerKim.showCustomerInfo());

    }
}
