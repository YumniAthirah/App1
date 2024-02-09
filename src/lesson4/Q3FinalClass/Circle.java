package lesson4.Q3FinalClass;

public final class Circle {
    private final double radius;
    private final double PI = 3.14159;
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    public double calculateArea() {
        return PI * radius * radius;
    }
}