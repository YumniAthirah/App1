package Assignment.Assignment3.A3Assignment;

public class A3Circle extends A3Shape{
    private double radius;

    public A3Circle(double rad){
        this.radius = rad;
    }

    @Override
    public double calculateArea(){
        return Math.PI * Math.pow(radius, 2);
    }
}
