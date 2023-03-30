package ch09;

public class Truck extends Car {
    private int tone;

    public Truck(String model, String color, String company) {
        super(model, color, company);
    }

    public void load() {
        System.out.println("짐을 싣다.");
        startCar();
    }

    public void offLoad() {
        stopCar();
        System.out.println("짐을 내리다.");
    }
}
