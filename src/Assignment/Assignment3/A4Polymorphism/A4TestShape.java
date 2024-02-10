package Assignment.Assignment3.A4Polymorphism;

public class A4TestShape {
    public static void main(String[] args) {
        A4Rectangle rectangle = new A4Rectangle(3, 2);
        A4Circle circle = new A4Circle(6);
        A4Shape shape = new A4Shape();  //difference between Assignment 3 and 4

        System.out.println("The Area of rectangle = " + rectangle.area());
        System.out.println("The Area of circle = " + circle.area());
        System.out.println("The Area of shape = " + shape.area());
        
    }
}
