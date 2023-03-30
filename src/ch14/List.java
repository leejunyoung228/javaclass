package ch14;

public interface List {
    Node add(String data);
    Node remove(int position);
    void printAll();
    Node insert(String data, int position);

    Node getElement(int position);
    void removeAll();
    int getSize();
    boolean isEmpty();
}
