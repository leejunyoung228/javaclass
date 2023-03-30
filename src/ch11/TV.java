package ch11;

public class TV implements Sound{
    private int soundLevel;

    @Override
    public void soundUp() {
        soundLevel++;
    }

    @Override
    public void soundDown() {
        soundLevel--;
    }

    public void showInfo(){
        System.out.println("티비의 현재 음량은 " + soundLevel + "입니다.");
    }
}
