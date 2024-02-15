package lesson8.Assignment.A1ShapeHierarchy;

public abstract class Shape {
    String color;
    boolean filled;

    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
    
    public abstract double getArea();
    public abstract double getPerimeter();

    @Override
    public String toString(){
        return "Shape(" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ')'; 
    }
}
