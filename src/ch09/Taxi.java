package ch09;

public class Taxi extends Car {
    private int meter;

    public Taxi(String model, String color, String company) {
        super(model, color, company);
    }

    public void meterUp() {
        startCar();
        System.out.println("미터기를 올리다.");
    }

    public void meterDown(){
        stopCar();
        System.out.println("미터기를 정지하다.");
    }
}
