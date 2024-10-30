sealed interface Shape permits Circle, Rectangle, Triangle {}

record Circle(double radius) implements Shape {}
record Rectangle(double length, double width) implements Shape {}
record Triangle(double base, double height) implements Shape {}

