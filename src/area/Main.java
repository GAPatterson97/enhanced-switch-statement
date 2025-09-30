package area;
import static area.AreaCalculator.calculateArea;

public class Main {
    public static void main(String[] args) {
        Shape shape1 = new Circle(10);
        Shape shape2 = new Square(10);
        System.out.println("Area of Circle: " + calculateArea(shape1));
        System.out.println("Area of Square: " + calculateArea(shape2));
    }
}
