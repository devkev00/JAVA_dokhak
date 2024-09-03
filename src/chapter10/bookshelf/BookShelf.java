package chapter10.bookshelf;

public class BookShelf extends Shelf implements Queue {

    @Override
    public void enQueue(String title) {
        shelf.add(title);
    }

    @Override
    public String deQueue() {
        return shelf.remove(0); // 큐에서 첫 번째 요소를 제거
    }

    @Override
    public int getSize() {
        return getCount();
    }
}
