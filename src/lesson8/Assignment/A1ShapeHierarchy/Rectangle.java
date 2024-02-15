package lesson8.Assignment.A1ShapeHierarchy;

public class Rectangle extends Shape{
    private double height;
    private double width;

    public Rectangle(String color, boolean filled, double height, double width) {
        super(color, filled);
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea() {
        return height * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (height + width);
    }
    
}
