package ch04;

public class Student {
    int num;
    String name;
    String gender;

   void study() {
        System.out.println("공부하기");
    }
    void eating() {
        System.out.println("밥먹기");
    }
    void goToSchool() {
        System.out.println("학교가기");
    }

    void showInfo() {
        System.out.println("이름은 " + name + "입니다.");
    }
}
