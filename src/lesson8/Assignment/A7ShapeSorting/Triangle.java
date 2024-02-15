package lesson8.Assignment.A7ShapeSorting;

public class Triangle implements SortableShape{
    private double height;
    private double base;

    public Triangle(double height, double base){
        this.height = height;
        this.base = base;
    }

    @Override
    public double area() {
        double area = 0.5 * height * base;
        return Double.parseDouble(String.format("%.2f", area));
    }
    
}
