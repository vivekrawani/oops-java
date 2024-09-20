package Fanfo;

public interface House {
    default void stop() {
        System.out.println("House stopped.");
    }

    // Static method
    static void info() {
        System.out.println("This is a House interface.");
    }
}
