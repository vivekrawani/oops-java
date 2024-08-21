package Fanfo;

public abstract class Parent {
    static  int i = 0;
    abstract void print1();
    void print2(){
        System.out.println("print 2 " + i);
    }
}
