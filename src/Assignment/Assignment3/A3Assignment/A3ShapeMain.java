package Assignment.Assignment3.A3Assignment;

public class A3ShapeMain {
    public static void main(String[] args) {
        A3Rectangle rectangle = new A3Rectangle(3, 2);
        A3Circle circle = new A3Circle(6);
        //A3Shape shape = new A3Shape(); //difference between Assignment 3 and 4

        
        System.out.println("Area of rectangle: " + rectangle.calculateArea());
        System.out.println("Area of circle: " + circle.calculateArea());
        //System.out.println("Area of shape: " + shape.calculateArea());
    }
}
