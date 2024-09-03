package chapter10.bookshelf;

public interface Queue {
    void enQueue(String title); // 큐에 추가
    String deQueue(); // 큐에서 제거
    int getSize(); //
}
