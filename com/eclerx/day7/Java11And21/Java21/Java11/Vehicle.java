package Java11;

// Vehicle.java
interface Vehicle {

    // Default method that calls a private helper method
    default void start() {
        System.out.println("Vehicle is starting...");
        checkEngine();
    }

    // Static method that calls a private static helper method
    static void stop() {
        System.out.println("Vehicle is stopping...");
        logEvent();
    }

    // Private instance method (used by default methods)
    private void checkEngine() {
        System.out.println("Checking engine status...");
    }

    // Private static method (used by static methods)
    private static void logEvent() {
        System.out.println("Logging the stop event...");
    }
}

// A class implementing the Vehicle interface
class Car implements Vehicle {
    // No need to override 'start' or 'stop'
    // The default and static methods from Vehicle are available
}

