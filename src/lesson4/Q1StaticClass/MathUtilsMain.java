package lesson4.Q1StaticClass;

public class MathUtilsMain {
    public static void main(String[] args) {
        System.out.println("Result of adding 10 and 5: " + MathUtils.add(10, 5));
        System.out.println("Result of subtracting 8 from 15: " + MathUtils.subtract(15, 8));

        int number = 17;
        if (MathUtils.isEven(number))
            System.out.println(number + " is even.");
        else
            System.out.println(number + " is odd.");
    }
}

// Static classes in Java are similar to static classes in C#, they cannot be instantiated,
// and they can only contain static members. They are appropriate for utility classes that
// contain methods applicable to a specific domain but don't require instance-specific data.
// Static classes are also useful when you want to group related methods together without the
// need for creating instances of the class.

