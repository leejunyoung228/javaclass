package javacollectionframework.arraylist;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> myArrayList = new ArrayList<String>();
        UserInput userInput = new UserInput();
        int size = Integer.parseInt(userInput.getUserInput("size : "));
        for (int i = 0; i < size; i++) {
            myArrayList.add(userInput.getUserInput("input : "));
        }
        System.out.printf("arrayList : ");
        for (String i : myArrayList) {
            System.out.printf(i + " ");
        }
        System.out.println("");
    }
}