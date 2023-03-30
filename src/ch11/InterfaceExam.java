package ch11;

public class InterfaceExam {
    public static void main(String[] args) {
        Sound tv = new TV();
        Sound radio = new Radio();
        tv.soundUp();
        tv.soundDown();
        tv.showInfo();

        radio.soundUp();
        radio.soundDown();
        radio.showInfo();
        System.out.println(tv.equals(radio));
    }
}
