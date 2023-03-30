package ch14;

public class LinkedList implements List{
    private Node head;
    private int count;
    @Override
    public Node add(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            //비어 있다
            head = newNode;
        }else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        count++;
        return newNode;
    }

    @Override
    public Node remove(int position) {
        Node temp = head;

        if (position < 0 || position > count) {
            System.out.println("position 값을 수정하세요");
            return null;
        }

        if (position == 0) {
            head = head.next;
        }else {
            Node pre = null;
            for (int i = 0; i < position; i++) {
                pre = temp;
                temp = temp.next;
            }
            pre.next = temp.next;
        }
        count--;
        return temp;
    }

    @Override
    public void printAll() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.getData());
            if (temp.next != null) {
                System.out.print(" -> ");
            }
            temp = temp.next;
        }
        System.out.println();
    }

    @Override
    public Node insert(String data, int position) {
        Node newNode = new Node(data);
        Node temp = head;

        if (position < 0 || position > count) {
            System.out.println("position 값을 수정하세요");
            return null;
        }

        if (position == 0) {
            newNode.next = head;
            head = newNode;
        }else {
            for (int i = 0; i < position - 1; i++) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }

        count++;
        return newNode;
    }

    @Override
    public Node getElement(int position) {
        Node temp = head;
        if (position < 0 || position > count) {
            System.out.println("position 값을 수정하세요");
            return null;
        }

        if (position == 0) {
            return head;
        }
        for (int i = 0; i < position; i++) {
            temp = temp.next;
        }
        return temp;
    }

    @Override
    public void removeAll() {
        head = null;
    }

    @Override
    public int getSize() {
        return count;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }
}
