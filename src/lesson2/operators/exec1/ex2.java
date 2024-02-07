package lesson2.operators.exec1;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        boolean p, q;
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter p:");
        p = scanner.nextBoolean();
        System.out.println("Enter q:");
        q = scanner.nextBoolean();

        System.out.printf("\nThe answer for p = %b q = %b :\n", p, q);

        if(p && q){
            q = false;
        }else{
            if(!q)
            System.out.println(p);
            if(p == q)
            System.out.println(p||q);
        }
        System.out.println(q);

        scanner.close();
    }
}
