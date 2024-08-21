package Fanfo;

public class SmartPhone extends Phone {
    int megaPx;
    public SmartPhone(int number) {
        super(number);
    }
    public void click() {
        System.out.println("A photograph was clicked");
    }

    public void playMusic() {
        System.out.println("Music Started Playing");
    }

    public void pauseMusic() {
        System.out.println("Music Paused");
    }

    public void stopMusic() {
        System.out.println("Music Stopped");
    }
}
