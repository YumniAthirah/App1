package lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class sequenceSearch {

    public static void main(String[] args) {
        int[] a = { 99, 105, 86, 34, 108, 25, 11, 96 };
        // int k = 10;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter k: ");
        int k = sc.nextInt();
        sc.close();

        int s = seqSearch(a, k);
        System.out.println("\na=" + Arrays.toString(a));

        if (s == -1) {
            System.out.printf("%d is not found", k);
        } else {
            System.out.printf("%d is found at a[%d]", k, s);
        }

    }

    public static int seqSearch(int[] a, int k) {
        int i = 0;
        int len = a.length;

        while (i < len && a[i] != k) {
            i++;
        }

        if (i >= len) {
            i = -1;
        }
        return i;
    }
}
