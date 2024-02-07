package lesson2.operators.exec1;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        int x, y;
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter x:");
        x = scanner.nextInt();
        System.out.println("Enter y:");
        y = scanner.nextInt();

        System.out.printf("\nThe answer for x=%d y=%d :\n", x, y);

        if(x!=y){
            System.out.println("1");
        }
        if(x>y){
            System.out.println("2");
        }
        if(x%y == 0){
            System.out.println("3");
        }

        scanner.close();
    }    
}
