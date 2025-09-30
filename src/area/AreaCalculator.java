package area;

public class AreaCalculator {
    public static double calculateArea(Shape shape) {
        return switch (shape) {
            case Circle s -> Math.PI * s.getRadius() * s.getRadius();
            case Square s -> s.getLength() * s.getLength();
            default -> throw new IllegalArgumentException("Unknown shape");
        };
    }
}