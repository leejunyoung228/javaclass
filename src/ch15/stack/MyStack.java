package ch15.stack;

import ch14.LinkedList;
import ch14.Node;

public class MyStack extends LinkedList implements IStack{
    private Node top;

    @Override
    public String pop() {
        if (isEmpty()){
            System.out.println("비어있습니다");
            return null;
        }
        top = top.next;
        return remove(0).getData();
    }

    @Override
    public void push(String data) {
        Node newNode = insert(data, 0);
        top = newNode;
    }

    @Override
    public void printAll() {
        if (isEmpty()) {
            System.out.println("비어있습니다");
            return;
        }
        Node temp = top;
        System.out.println("=====");
        while (temp != null) {
            System.out.println(temp.getData());
            temp = temp.next;
        }
        System.out.println("====");
    }
}
