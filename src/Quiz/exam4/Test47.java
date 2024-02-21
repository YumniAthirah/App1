package Quiz.exam4;

class Calculator{
    int calculate(int i1, int i2){
        System.out.println("int");
        return i1 + i2;
    }

    double calculate(byte b1, byte b2){
        System.out.println("byte");
        return b1 % b2;                     //return remainder answer should be 0.0 if executed ia this method
    }
}
public class Test47 {
    public static void main(String[] args) {
        byte b = 100;
        int i = 20;
        System.out.println(new Calculator().calculate(b, i));
    }
}

// `new Calculator().calculate(b, i)` tags to `calculate(int, int)` as
// byte value is implicitly casted to int type.

// no exact match for (byte, int) in the overloaded methods, Java tries to find the closest match

// In this case, because int is wider than byte,
// it promotes the byte to an int and invokes the calculate(int, int) method
// It can accept both byte and int arguments without any loss of precision.
