package lesson2.operators.exec1;

import java.util.Scanner;

public class FlowStatement {
    public static void main(String[] args) {
        int a, b, c, m;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a:");
        a = sc.nextInt();
        System.out.println("Enter b:");
        b = sc.nextInt();
        System.out.println("Enter c:");
        c = sc.nextInt();
        sc.close();

        m = (a <= b) ? b : a;
        m = (m <= c) ? c : m;

        System.out.printf("maximum = %d", m);
    }
}


