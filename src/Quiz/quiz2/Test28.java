package Quiz.quiz2;

import Quiz.quiz2.Test28A.A;

public class Test28 {
    public static void main(String[] args) {
        A obj = new A();
        System.out.println(obj.i1);
        //System.out.println(obj.i2);     //error
        //System.out.println(obj.i3);     //error package private
        //System.out.println(obj.i4);     //error
    }
}

/* package lesson4.quiz2.Test28A;       //different package

public class A {
    public int i1;
    protected int i2;
    int i3;                             //package private
    private int i4;    
} */
