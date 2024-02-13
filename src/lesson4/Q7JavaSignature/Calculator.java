package lesson4.Q7JavaSignature;

public class Calculator {

    //add two integers
    public int add(int a, int b){
        return a + b;
    }

    //add two floating numbers
    public double add(double a, double b){
        return a + b;
    }

    //find the square of an integer
    public int square(int a){
        return a * a;
    }

    //find the square of a floating-point number
    public double square(double a){
        return a * a;
    }

    //find average of three integers
    public double average(int a, int b, int c){
        return (double)(a + b + c) / 3;
    }

    //find average of three floating-point numbers
    public double average(double a, double b, double c){
        return (a + b + c) / 3;
    }   
}

//overloading method
