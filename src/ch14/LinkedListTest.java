package ch14;

public class LinkedListTest {
    public static void main(String[] args) {
        //1. linkedlist 객체 생성 : list
        LinkedList list = new LinkedList();

        //2. list.add(), printAll()
        list.add("choi");
        list.add("kim");
        list.add("lee");
        System.out.println(list.getSize());
        list.printAll();

        //3. list.insert(), printAll()
        list.insert("park", 0);
        list.printAll();

        //4. list.remove(), printAll()
        list.remove(2);
        list.printAll();

        System.out.println(list.getElement(1).getData());
    }
}
