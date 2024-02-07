package lesson2.operators.exec1;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your start value: ");
        int start = sc.nextInt();
        System.out.println("Enter your end value: ");
        int end = sc.nextInt();
        prime(start, end);
        sc.close();
    }

    static boolean isPrime(int num){
        if(num <= -1) return false;               //eliminate number below 0
        for(int i = 2; i <= Math.sqrt(num); i++){
            // System.out.print(i);
            if(num % i == 0) return false;        //eliminate number that can be exactly divided by..
        }                                         //..number other than itself and 1 (baki = 0)
        return true;
    }

    static void prime(int start, int end){
        for(int i = start; i < end; i++){
            // System.out.println(i);
            if(isPrime(i)) System.out.print(i + " ");
        }
    }
    
}
