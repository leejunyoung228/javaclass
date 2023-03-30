package ch13;

public class TakeExam {
    public static void main(String[] args) {
        Person choi = new Person("choi", 5000);
        Subway brown = new Subway(3);
        Bus bus7_2 = new Bus("7-2");

//        choi.takeSubway(brown);
//        choi.takeBus(bus7_2);
        choi.take(brown);
        choi.take(bus7_2);

        choi.showInfo();
        brown.showInfo();
        bus7_2.showInfo();

        System.out.println("=====================================================================");

        Person kim = new Person("kim", 10000);
        Car x6 = new Car("myCar");
        GasStation suyeong = new GasStation("suyeong");

        kim.oiling(x6,suyeong, 2);
        kim.takeCar(x6, 30);
        kim.showInfo();
        suyeong.showInfo();
        x6.showInfo();
    }
}
