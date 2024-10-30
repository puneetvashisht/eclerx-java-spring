package RecordPattern;

public class RecordPatternDemo {

    // Nested record to represent a Rectangle using two Points
    public record Rectangle(Point topLeft, Point bottomRight) {}

    // Method to process Points using a switch with record patterns
    public static String processPoint(Point point) {
        return switch (point) {
            case Point(int x, int y) when x == y -> 
                "Point is on the diagonal at: (" + x + ", " + y + ")";
            case Point(int x, int y) -> 
                "Point at: (" + x + ", " + y + ")";
        };
    }

    // Method to calculate area of a Rectangle using record patterns
    public static int calculateArea(Rectangle rectangle) {
        return switch (rectangle) {
            case Rectangle(Point(int x1, int y1), Point(int x2, int y2)) -> 
                Math.abs((x2 - x1) * (y2 - y1));
        };
    }

    public static void main(String[] args) {
        // Create instances of Point and Rectangle
        Point p1 = new Point(3, 3);
        Point p2 = new Point(1, 4);
        Rectangle rect = new Rectangle(p1, p2);

        // Test processPoint() method
        System.out.println(processPoint(p1)); // Point is on the diagonal at: (3, 3)
        System.out.println(processPoint(p2)); // Point at: (1, 4)

        // Test calculateArea() method
        System.out.println("Area of rectangle: " + calculateArea(rect)); // Area of rectangle: 6
    }
}
