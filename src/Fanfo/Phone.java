package Fanfo;

public class Phone {
    int number;

    public Phone(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void call() {
        System.out.println("Call is made");
    }

    public void message() {
        System.out.println("Message is sent");
    }
}
