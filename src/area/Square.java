package area;

public class Square implements Shape{
    private double length;

    Square(double length) {
        this.length = length;
    }

    double getLength() {
        return length;
    }
}
