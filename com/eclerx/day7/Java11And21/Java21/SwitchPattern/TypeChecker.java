public class TypeChecker {

    // Method using switch pattern matching to determine the type of an object.
    static String getType(Object obj) {
        return switch (obj) {
            case String s -> "String with value: " + s;
            case Integer i -> "Integer with value: " + i;
            case null -> "It's a null!";
            default -> "Unknown type";
        };
    }

    public static void main(String[] args) {
        // Test the getType method with different objects.
        Object strObj = "Hello, Java!";
        Object intObj = 42;
        Object nullObj = null;
        Object listObj = new java.util.ArrayList<>();

        // Display the results
        System.out.println(getType(strObj));  // String with value: Hello, Java!
        System.out.println(getType(intObj));  // Integer with value: 42
        System.out.println(getType(nullObj)); // It's a null!
        System.out.println(getType(listObj)); // Unknown type
    }
}
