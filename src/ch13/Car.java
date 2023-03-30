package ch13;

public class Car {
    private String name;
    private int liter;

    public Car(String name) {
        this.name = name;
    }

    public int getLiter() {
        return liter;
    }

    public void setLiter(int liter) {
        this.liter += liter;
    }

    public void take(int km) {
        this.liter -= km/15;
    }

    public void showInfo() {
        System.out.println(name + "차의 남은 기름은 " + liter + "L입니다.");
    }
}
