package ch15.queue;

public class MyQueueTest {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.enQueue("A");
        queue.enQueue("B");
        queue.enQueue("C");
        queue.enQueue("D");
        queue.printAll();

        queue.deQueue();
        queue.deQueue();
        queue.printAll();
    }
}
