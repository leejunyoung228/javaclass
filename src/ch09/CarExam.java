package ch09;

public class CarExam {
    public static void main(String[] args) {
        Car car = new Car("model X", "space gray", "tesla");
        car.showInfo();
        car.startCar();
        car.speedUp();
        car.stopCar();

        Taxi taxi = new Taxi("k3", "blue", "kia");
        taxi.showInfo();
        taxi.meterUp();
        taxi.meterDown();

        Truck truck = new Truck("benz", "white", "benz");
        truck.showInfo();
        truck.load();
        truck.offLoad();
    }
}
