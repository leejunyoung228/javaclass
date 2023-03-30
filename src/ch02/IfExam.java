package ch02;

public class IfExam {
    public static void main(String[] args) {
        int n = args.length;

        if (n == 0) {
            System.out.println("매개변수를 입력하세요!");
        } else if (n == 1) {
            System.out.println("매개변수는 " + args[0] + "입니다.");
        } else if (n ==2) {
            System.out.println("매개변수는 " + args[0] + ", " + args[1] + "입나다.");
        } else {
            System.out.println("매개변수는 2개 까지만 입력하세요!");
        }
    }
}
