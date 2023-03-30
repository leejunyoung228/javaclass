package ch05;

public class Student {
    String name;
    static String group = "Embedded";
    final static String school = "busan software meister";

    public void showInfo() {
        System.out.println("이름은 " + name + "이고, 소속 학과는 " + group + "입니다.");
    }
}
