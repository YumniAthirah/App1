package lesson2.operators.exec1;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your start term: ");
        int f = sc.nextInt();
        fibonacci(f);
        sc.close();
    }

    static int fibonacci(int n) {
        int Fn = 0;
        int F1 = 0;
        int F2 = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(F1 + " ");
            Fn = F1 + F2;
            F1 = F2;
            F2= Fn;
        }
        return Fn;
    }

}
