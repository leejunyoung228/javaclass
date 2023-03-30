package ch11;

public class Radio implements Sound{
    private int soundLevel;

    @Override
    public void soundUp() {
        soundLevel += 2;
    }

    @Override
    public void soundDown() {
        soundLevel -= 2;
    }

    public void showInfo() {
        System.out.println("라디오의 현재 음량은 " + soundLevel + "입니다.");
    }
}
