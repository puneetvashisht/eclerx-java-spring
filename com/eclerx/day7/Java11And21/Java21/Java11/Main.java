package Java11;

// Main.java
public class Main {
    public static void main(String[] args) {
        // Using the default method
        Vehicle car = new Car();
        car.start();  // Vehicle is starting... Checking engine status...

        // Using the static method
        Vehicle.stop();  // Vehicle is stopping... Logging the stop event...
    }
}

