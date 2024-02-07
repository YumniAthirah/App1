package lesson2.operators.exec1;

import java.util.Scanner;

public class MatrixAdd {
    //n = 100
    //sum of 1 to n
    //sum = 1 + 2 + 3 + .. 100

    //  0 +   1 +   2 +   3 + ... +  47 +  48 +  49     50
    //100 +  99 +  98 +  97 +...  +  53 +  52 +  51     
    //100 + 100 + 100 + 100 + ... + 100 + 100 + 100 + 100 => 100 * 50 + 50
    //                                                    => 50(100-1)
    //n = 100 => (n/2)(n+1)

    //using this formula is faster than using the loop

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your last value to sum: ");
        int n = sc.nextInt();
        //long start1 = System.currentTimeMillis();
        System.out.println("matrix: " + matrix(n));
        
        System.out.println("verify: " + verify(n));
        sc.close();
    }

    static int verify(int n){
        int f = 0;
        for(int i=0; i<=n; i++) f += i;
        return f;
    }

    static int matrix(int n){
        return (n/2)*(n+1);
    }
}
