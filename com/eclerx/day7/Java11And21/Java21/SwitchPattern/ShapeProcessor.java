public class ShapeProcessor {

    public static void processShape(Shape shape) {
        String result = switch (shape) {
            case Circle(double radius) -> 
                "Circle with radius: " + radius + " | Area: " + (Math.PI * radius * radius);
            
            case Rectangle(double length, double width) -> 
                "Rectangle with length: " + length + ", width: " + width + 
                " | Area: " + (length * width);
            
            case Triangle(double base, double height) -> 
                "Triangle with base: " + base + ", height: " + height + 
                " | Area: " + (0.5 * base * height);
            
            default -> throw new IllegalArgumentException("Unknown shape: " + shape);
        };

        System.out.println(result);
    }

    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);
        Shape triangle = new Triangle(3, 7);

        processShape(circle);     // Circle with radius: 5.0 | Area: 78.53981633974483
        processShape(rectangle);  // Rectangle with length: 4.0, width: 6.0 | Area: 24.0
        processShape(triangle);   // Triangle with base: 3.0, height: 7.0 | Area: 10.5
    }
}
