package by.andersen.kudko.facade.equipment;

public class Amplifier {
    public void on() {
        System.out.println("amplifier on");
    }

    public void setDvd(DvdPlayer dvd) {
        System.out.println("amplifier dvd set");
    }

    public void setSurroundSound() {
        System.out.println("surround sound");
    }

    public void setVolume(int volume) {
        System.out.println("amplifier set volume " + volume);
    }
}
