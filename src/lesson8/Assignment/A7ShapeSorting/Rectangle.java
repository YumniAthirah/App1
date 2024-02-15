package lesson8.Assignment.A7ShapeSorting;

public class Rectangle implements SortableShape{
    private double height;
    private double width;

    public Rectangle(double height, double width){
        this.height = height;
        this.width = width;
    }

    @Override
    public double area() {
        double area = height * width;
        return Double.parseDouble(String.format("%.2f", area));
    }
    
}
