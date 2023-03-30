package ch15.queue;

public interface IQueue {
    void enQueue(String data);
    String deQueue();
    void printAll();
}
