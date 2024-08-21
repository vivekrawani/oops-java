package Fanfo;

public class TestingSomething {
    int key;

    public TestingSomething(int key) {
        this.key = key;
    }
    public void aNonStaticMethod(){
        System.out.println("In methhod");
    }

    static  {
        System.out.println("in static block");
    }

    {
        System.out.println("in non static block");
    }


}
