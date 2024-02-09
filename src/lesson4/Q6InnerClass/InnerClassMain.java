package lesson4.Q6InnerClass;

public class InnerClassMain {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner("InnerObject");
        System.out.println("Inner Name: " + inner.getName());
    }
}


