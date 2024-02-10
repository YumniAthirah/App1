package Assignment.Assignment3.A4Polymorphism;

public class A4Rectangle extends A4Shape{
    private double length;
    private double width;

    public A4Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    @Override
    public double area(){
        return length * width;
    }

}
