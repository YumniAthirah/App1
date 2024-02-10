package lesson4.Q7JavaSignature;

import java.util.Scanner;

public class CalculatorMainDraft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
         * int q1 = calculator.add(13, 15);
         * System.out.println("a. You need to add two integers:\n 13 + 15 = " + q1);
         */

        System.out.println("a.add(integers)         b.add(floating numbers)");
        System.out.println("c.square(integer)       d.square(floating number)");
        System.out.println("e.average(integers)     f.average(floating numbers)");
        System.out.println("\nEnter which calculation: ");

        String calc = sc.nextLine();
        System.out.println(switchCase(calc) + "\n");

        sc.close();

    }

    static double switchCase(String calc) {
        Calculator calculator = new Calculator();
        Scanner scNumber = new Scanner(System.in);

        double ret = 0;
        switch (calc) {
            case "a":
                System.out.println("\nEnter x: ");
                int xa = scNumber.nextInt();
                System.out.println("\nEnter y: ");
                int ya = scNumber.nextInt();
                System.out.print("\nThe result: ");
                ret = calculator.add(xa, ya);
                break;

            case "b":
                System.out.println("\nEnter x: ");
                double xb = scNumber.nextDouble();
                System.out.println("\nEnter y: ");
                double yb = scNumber.nextDouble();
                System.out.print("\nThe result: ");
                ret = calculator.add(xb, yb);
                break;

            case "c":
                System.out.println("\nEnter x: ");
                int xc = scNumber.nextInt();
                System.out.print("\nThe result: ");
                ret = calculator.square(xc);
                break;

            case "d":
                System.out.println("\nEnter x: ");
                double xd = scNumber.nextDouble();
                System.out.print("\nThe result: ");
                ret = calculator.square(xd);
                break;

            case "e":
                System.out.println("\nEnter x: ");
                int xe = scNumber.nextInt();
                System.out.println("\nEnter y: ");
                int ye = scNumber.nextInt();
                System.out.println("\nEnter z: ");
                int ze = scNumber.nextInt();
                System.out.print("\nThe result: ");
                ret = calculator.average(xe, ye, ze);
                break;

            case "f":
                System.out.println("\nEnter x: ");
                double xf = scNumber.nextDouble();
                System.out.println("\nEnter y: ");
                double yf = scNumber.nextInt();
                System.out.println("\nEnter z: ");
                double zf = scNumber.nextDouble();
                System.out.print("\nThe result: ");
                ret = calculator.average(xf, yf, zf);
                break;

            default:
                ret = -1;
                break;

        }

        return ret;
    }
}
