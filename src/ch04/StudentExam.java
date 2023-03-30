package ch04;

public class StudentExam {
    public static void main(String[] args) {
        Student kim = new Student();
        Student choi = new Student();
        Student seo = new Student();

        kim.name = "kim";
        choi.name = "choi";
        seo.name = "seo";

        kim.showInfo();
        choi.showInfo();
        seo.showInfo();
    }
}
