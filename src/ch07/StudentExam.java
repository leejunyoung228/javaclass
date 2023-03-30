package ch07;

public class StudentExam {
    public static void main(String[] args) {
        Student s1 = new Student("choi", 3);
        Student s2 = new Student("kim", 2);
        Student s3 = new Student("seo", 1);

        s1.setName("june");
        System.out.println(s1.getName());
    }
}
