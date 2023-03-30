package ch15.stack;

public class MyStackTest {
    public static void main(String[] args) {
        MyStack stack = new MyStack();

        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");
        stack.printAll();
        stack.pop();
        stack.pop();
        stack.printAll();
    }
}
