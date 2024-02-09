package lesson4.Q3FinalClass;




public class FinalClassMain {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Area of the circle: " + circle.calculateArea());
    }
}
// A final class in Java cannot be subclassed. It means that no other class can extend a final class.
// Final classes are used when you want to prevent inheritance or extension of a class. This is
// appropriate when you have a class that should not have any subclasses or when you want to ensure
// that the behavior of the class remains consistent and cannot be changed by subclasses.

