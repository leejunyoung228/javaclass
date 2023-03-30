package ch14;

public class Node {
    private String data;
    public Node next;

    public Node(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }
}