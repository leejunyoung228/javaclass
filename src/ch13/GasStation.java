package ch13;

public class GasStation {
    private String address;
    private int gasAccount;
    private int money;

    public GasStation(String address) {
        this.address = address;
        this.gasAccount = 100;
    }

    public int oiling(Car car, int liter) {
        this.gasAccount -= liter;
        car.setLiter(liter);
        this.money += liter * 1600;
        return liter * 1600;
    }

    public void showInfo(){
        System.out.println(address + "지점의 남은 기름은 " + gasAccount + "L이고, 수익은 " + money + "원 입니다.");
    }
}
