package Fanfo;

public abstract class Parent {
    static  int i = 0;

    public Parent() {
        System.out.println("Parent called");
    }

    abstract void print1();
    void print2(){
        System.out.println("print 2 " + i);
    }
}
