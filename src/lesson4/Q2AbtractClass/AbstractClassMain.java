package lesson4.Q2AbtractClass;

public class AbstractClassMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 4);
        Circle circle = new Circle(3);
        
        System.out.println("Area of rectangle: " + rectangle.calculateArea());
        System.out.println("Area of circle: " + circle.calculateArea());
    }

}

// An abstract class in Java cannot be instantiated. It's meant to be extended by subclasses,
// which provide implementations for the abstract methods defined in the abstract class.
// Abstract classes are appropriate when you have a class that serves as a template for other
// classes and provides common behavior or structure that subclasses can inherit and extend.

