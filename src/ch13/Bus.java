package ch13;

public class Bus implements Take{
    private String number;
    private int passengerCount;
    private int money;

    public Bus(String number) {
        this.number = number;
    }

    @Override
    public void take(int money) {
        this.money += money;
        this.passengerCount++;
    }

    @Override
    public void showInfo(){
        System.out.println(number + "번 버스의 누적 탑승 인원 수는 " + passengerCount + "명 이고, 수입은 " + money + "원 입니다.");
    }
}