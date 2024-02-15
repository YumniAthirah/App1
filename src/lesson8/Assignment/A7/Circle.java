package lesson8.Assignment.A7;

public class Circle implements SortableShape{
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double area() {
        double area = Math.PI * Math.pow(radius, 2);
        return Double.parseDouble(String.format("%.2f", area));
    }
    
}
