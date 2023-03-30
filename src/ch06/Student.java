package ch06;

public class Student {
    String name;
    int grade;
    String group;

    public Student() {}

    //생성자
    public Student(String name) {
        this.name = name;
    }

    public Student(String name, int grade) {
        this(name);
        this.grade = grade;
    }

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
        System.out.println("이름은 " + name + "이고, " + grade + "학년입니다.");
    }
}
