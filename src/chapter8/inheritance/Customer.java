package chapter8.inheritance;

public class Customer {

   protected int customerID;
   protected String customerName;
   protected String customerGrade;
   int bonusPoint;
   protected double bonusRatio;

//   public Customer() {
//       customerGrade = "SILVER";
//       bonusRatio = 0.01;
//
//       System.out.println("Customer Created");
//   }

   public Customer(int customerID, String customerName) {
       this.customerID = customerID;
       this.customerName = customerName;
       this.customerGrade = "SILVER";
       bonusRatio = 0.01;

       System.out.println("Customer(int, String) Created");
   }

   public int calcPrice(int price) {
       bonusPoint += price * bonusRatio;
       return price;
   }

   public String showCustomerInfo() {
       return customerName + " 님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.";
   }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerGrade() {
        return customerGrade;
    }

    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }

    public int getBonusPoint() {
        return bonusPoint;
    }

    public void setBonusPoint(int bonusPoint) {
        this.bonusPoint = bonusPoint;
    }

    public double getBonusRatio() {
        return bonusRatio;
    }

    public void setBonusRatio(double bonusRatio) {
        this.bonusRatio = bonusRatio;
    }
}
