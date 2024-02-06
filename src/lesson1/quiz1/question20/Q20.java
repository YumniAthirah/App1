package lesson1.quiz1.question20;

public class Q20 {
    public static void main(String[] args){
        int a =3;
        int b =5;
        int c =7;
        int d =9;
        boolean res = --a + --b < 1 && c++ + d++ > 1;
        System.out.printf("a = %d, b = %d, c = %d, d = %d, res = %b",
         a, b, c, d, res);
    }
    
}
