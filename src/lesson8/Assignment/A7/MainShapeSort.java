package lesson8.Assignment.A7;

public class MainShapeSort {
    public static void main(String[] args) {
        Circle circle = new Circle(8);
        Rectangle rectangle = new Rectangle(3, 2);
        Triangle triangle = new Triangle(3, 6);

        SortableShape[] shapes = {rectangle, circle, triangle};

        System.out.println("Areas before sorting");
        for (SortableShape shape : shapes) {
            System.out.println(shape.getClass().getSimpleName() + ": " + shape.area());
        }

        ShapeSorter.sort(shapes);

        System.out.println("\nAreas after sorting");
        for (SortableShape shape : shapes) {
            System.out.println(shape.getClass().getSimpleName() + ": " + shape.area());
        }
    }
}
