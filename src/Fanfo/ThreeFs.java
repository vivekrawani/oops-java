package Fanfo;

public class ThreeFs {
    public static void main(String[] args) {
//        System.out.println("hol");
//        FinalizeExample a = new FinalizeExample();
//        System.out.println("hola ");
//        a = null;
////        System.gc();
//        FinalizeExample b = new FinalizeExample();
//        b = null;
////        System.gc();
////        System.gc();
//        System.gc();
        try {
            int a = 5;
            int x = 5 / 0;
            System.out.println("int try block");System.out.println("int try block");
        } catch (Exception e) {
            System.out.println("In error");
//            throw new RuntimeException(e);
        } finally {
            System.out.println("this is called irrespective of error");
        }



    }
}
class FinalizeExample {

    public void finalize()
    {
        System.out.println("Called the finalize() method");
    }
}

class Finally {

}