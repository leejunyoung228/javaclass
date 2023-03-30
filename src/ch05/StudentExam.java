package ch05;

public class StudentExam {
    public static void main(String[] args) {
        Student choi = new Student();
        Student lee = new Student();
        Student kim = new Student();

        choi.name = "choi";
        lee.name = "lee";
        kim.name = "kim";

        choi.showInfo();
        lee.showInfo();
        kim.showInfo();
    }
}
