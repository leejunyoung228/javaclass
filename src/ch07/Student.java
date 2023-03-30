package ch07;

//접근제어지시자 -> private, public, protected, default
public class Student {
    private String name;
    private int grade;
    private static int count; //객체 생성시 ++, 객체가 몇개 생성 되었나?

    public Student() {
        count++;
    }

    public Student(String name) {
        this.name = name;
        count++;
    }

    public Student(String name, int grade) {
        this(name);
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Student.count = count;
    }
}
