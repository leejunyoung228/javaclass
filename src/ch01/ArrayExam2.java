package ch01;

public class ArrayExam2 {
    public static void main(String[] args) {
        String[] str = new String[5];
        str[0] = "Hello";
        str[1] = "Java";
        str[2] = "World";

        for (String a:str) {
            System.out.println(a);
        }
    }
}
