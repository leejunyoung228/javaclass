package ch02;

public class SwitchExam {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int day;

        switch (a) {
            default:
                day = 31;
                break;
            case 2:
                day = 28;
                break;
            case 4: case 6: case 9: case 11:
                day = 30;
                break;
        }
        System.out.println(a + "월의 총 일 수는 " + day + "입니다.");
    }
}
