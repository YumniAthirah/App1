package lesson8.example1;

public class Circle extends Border implements Shape, Filler{

    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    public boolean fillable() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'fillable'");
    }    
}
