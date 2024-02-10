package Assignment.Assignment3.A3Assignment;

public class A3Rectangle extends A3Shape{
    private double length;
    private double width;

    public A3Rectangle(double len, double w){
        this.length = len;
        this.width = w;
    }

    @Override
    public double calculateArea(){
        return length * width;
    }
}
