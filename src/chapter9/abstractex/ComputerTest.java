package chapter9.abstractex;

public class ComputerTest {
    public static void main(String[] args) {
//        Computer c1 = new Computer();
        Computer c2 = new Desktop();
//        Computer c3 = new Laptop();
        Computer c4 = new MyLabTop();

        c2.display();
        c4.display();

    }

}
