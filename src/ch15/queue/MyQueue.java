package ch15.queue;

import ch14.LinkedList;
import ch14.Node;

public class MyQueue extends LinkedList implements IQueue {
    private Node fornt, rear;

    @Override
    public void enQueue(String data) {
       Node newNode = null;

       if (isEmpty()) {
           newNode = add(data);
           fornt = newNode;
           rear = newNode;
       }else {
           newNode = add(data);
           rear = newNode;
       }
    }

    @Override
    public String deQueue() {
        if (isEmpty()) {
            System.out.println("비어있음");
            return null;
        } else {
            fornt = fornt.next;
            return remove(0).getData();
        }
    }

    @Override
    public void printAll() {
        if (isEmpty()) {
            System.out.println("큐가 비어 있습니다");
            return;
        }

        Node temp = fornt;
        while (temp != null) {
            System.out.print(temp.getData()+" ");
            temp = temp.next;
        }
        System.out.println();
    }
}
