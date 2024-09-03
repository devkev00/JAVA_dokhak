package chapter10.interfaceex;

public interface Sell {
    void sell();

    default void Order() {
        System.out.println("sell Order");
    }
}
