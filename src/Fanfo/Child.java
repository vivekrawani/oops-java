package Fanfo;

public class Child extends Parent{
    public Child() {
        System.out.println("child called");
    }

    @Override
    void print1() {

    }

    @Override
    void print2() {
        System.out.println("2");
    }

}
