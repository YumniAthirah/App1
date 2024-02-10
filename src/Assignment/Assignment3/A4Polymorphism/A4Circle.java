package Assignment.Assignment3.A4Polymorphism;

public class A4Circle extends A4Shape{
    private double radius;

    public A4Circle(double rad){
        this.radius = rad;
    }

    @Override
    public double area(){
        return Math.PI * Math.pow(radius, 2);
    }
    
}
