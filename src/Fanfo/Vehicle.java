package Fanfo;


public interface Vehicle {
    // Abstract method
    void start();

    // Default method
    default void stop() {
        System.out.println("Vehicle stopped.");
    }

    // Static method
    static void info() {
        System.out.println("This is a vehicle interface.");
    }

}
