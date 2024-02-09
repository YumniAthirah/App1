package lesson4.Q2AbtractClass;

public class Circle extends Shape {
    private double radius;
    private static final double PI = 3.14159;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return PI * radius * radius;
    }
}

