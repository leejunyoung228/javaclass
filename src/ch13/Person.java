package ch13;

public class Person {
    private String name;
    private int money;
    private boolean transfer;

    public void take(Take take) {
        if (take instanceof Bus) {
            takeBus((Bus) take);
        } else if (take instanceof Subway) {
            takeSubway((Subway) take);
        }
    }

    public Person(String name, int money) {
        this.name = name;
        this.money = money;
        this.transfer = false;
    }

    public void takeSubway(Subway subway) {
        if (this.money < 1250) {
            System.out.println("잔돈이 부족합니다.");
            return;
        }
        this.money -= 1250;
        subway.take(1250);
        this.transfer = true;
    }

    public void showInfo() {
        System.out.println(name + "님의 잔액은 "+ money + "원 입니다.");
    }

    public void takeBus(Bus bus) {
        if(this.transfer) {
            bus.take(200);
            this.money -= 200;
        }
    }

    public void oiling(Car car, GasStation gasStation, int liter) {
        this.money -= gasStation.oiling(car, liter);
    }

    public void takeCar(Car car, int km) {
        if (car.getLiter()*15 >= km) {
            car.take(km);
        } else {
            System.out.println("기름이 부족합니다.");
        }
    }
}
