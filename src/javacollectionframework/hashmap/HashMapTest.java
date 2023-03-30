package javacollectionframework.hashmap;

import java.util.HashMap;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap<String, String> myHashMap = new HashMap<>();
        UserInput userInput = new UserInput();
        int size = Integer.parseInt(userInput.getUserInput("size : "));
        for (int i = 0; i < size; i++) {
            String key = userInput.getUserInput("key : ");
            String value = userInput.getUserInput("value : ");
            myHashMap.put(key, value);
        }
        String key = userInput.getUserInput("Input the key : ");
        String value = myHashMap.get(key);
        if (value == null){
            System.out.println("You don't have key : "+key);
        }else {
            System.out.println("key : " + key + " value : "+value);
        }
    }
}
