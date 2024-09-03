package chapter10.interfaceex;

public interface Buy {
    void buy();

    default void Order() {
        System.out.println("buy Order");
    }
}
