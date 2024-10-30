package RecordPattern;

// Top-level record (in Point.java)
public record Point(int x, int y) {}

// This automatically generates:
// A constructor
// x() and y() getter methods
// equals(), hashCode(), and toString() methods

