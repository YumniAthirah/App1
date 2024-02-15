package lesson8.Assignment.A1ShapeHierarchy;

public class Square extends Shape{
    private double length;

    public Square(String color, boolean filled, double length) {
        super(color, filled);
        this.length = length;
    }

    @Override
    public double getArea() {
        return length * length;
    }

    @Override
    public double getPerimeter() {
        return 4 * length;
    }
    
}
