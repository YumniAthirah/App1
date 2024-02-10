package lesson4.Q7JavaSignature;

import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);

        System.out.println("\nEnter x: ");
        double x = sc.nextDouble();
        System.out.println("\nEnter y: ");
        double y = sc.nextDouble();
        System.out.println("\nEnter z: ");
        double z = sc.nextDouble();

        int xi = (int)x;
        int yi = (int)y;
        int zi = (int)z;

        System.out.println("\nThe result: ");
        //add
        System.out.println("a.add(integers)");
        System.out.printf("%d + %d = %d\n", xi, yi, calculator.add(xi, yi));
        System.out.println("\nb.add(floating numbers)");
        System.out.printf("%.2f + %.2f = %f\n", x, y, calculator.add(x, y));

        //square
        System.out.println("\nc.square(integer)");
        System.out.printf("square(%d) = %d\n", xi, calculator.square(xi));
        System.out.println("\nd.square(floating number)");
        System.out.printf("square(%.2f) = %f\n", x, calculator.square(x));

        //average
        System.out.println("\ne.average(integers)");
        System.out.printf("average(%d, %d, %d) = %f\n", xi, yi, zi, calculator.average(xi, yi, zi));
        System.out.println("\nf.average(floating numbers)");
        System.out.printf("average(%.2f, %.2f, %.2f) = %f\n", x, y, z, calculator.average(x, y, z));



        /*
         * int q1 = calculator.add(13, 15);
         * System.out.println("a. You need to add two integers:\n 13 + 15 = " + q1);
         */

    }
}
