package lesson4.quiz2;

public class Test30 {
    public static void main(String[] args) {
        char c = 'Z';
        long l = 100_001;       //underscore (_) is used to separate numeric values ==100001
        int i = 9_2;            //92
        
        //float f = 2.02;       //Without the "f", Java would interpret 2.02 as a double
        float f = 2.02f;
        
        //double d = 10_0.35;
        double d = 10_0.35d;    //100.35

        l = c + i;              //The Unicode value of 'Z' is 90 & int can be asigned to long type
        System.out.println(l);  //90 + 92

        f = c * l * i * f;      //90 * 182 * 92 * 2.02
        System.out.println(f);

        f = l + i + c;          //182 + 92 + 90
        System.out.println(f);

        i = (int)d;             //casting double to int
        System.out.println(i);

        f = (long)d;            //casting double to long
        System.out.println(f);

    }
}
