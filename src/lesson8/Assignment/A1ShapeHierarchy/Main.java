package lesson8.Assignment.A1ShapeHierarchy;

public class Main {
    public static void main(String[] args) {

        //Circle
        Circle circle = new Circle("red", true, 5);
        double area = circle.getArea();
        double peri = circle.getPerimeter();
        System.out.println("Circle: " + circle);
        System.out.printf("Area: %.2f, Perimeter : %.2f\n",  area, peri);

        System.out.println();

        //Rectangle
        Rectangle rectangle = new Rectangle("green", false, 3, 2);
        area = rectangle.getArea();
        peri = rectangle.getPerimeter();
        System.out.println("Rectangle: " + rectangle);
        System.out.printf("Area: %.2f, Perimeter : %.2f\n",  area, peri);
    
        System.out.println();

        //Rectangle
        Square square = new Square("green", false, 3);
        area = square.getArea();
        peri = square.getPerimeter();
        System.out.println("Square: " + square);
        System.out.printf("Area: %.2f, Perimeter : %.2f\n",  area, peri);

    
    }
}
