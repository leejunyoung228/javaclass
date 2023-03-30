package ch10;

public class AbstractExam {
    public static void main(String[] args) {
        MyShip myShip = new MyShip("동해선");
        myShip.showInfo();
        System.out.println(myShip.maxLuggage());
        System.out.println(myShip.maxPassengers());
    }
}
