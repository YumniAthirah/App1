package Quiz.exam4;

interface I1{
    public static void print(String str){
        System.out.println("I1:" + str.toUpperCase());
    }
}
class C1 implements I1{
    void print(String str){
        System.out.println("C1:" + str.toLowerCase());
    }
}
public class Test65 {
    public static void main(String[] args) {
        I1 obj = new C1();
        //obj.print("Java");
        I1.print("Java");
    }
}

// Super type reference variable can refer to an instance of Sub type,... 
// ...therefore the statement `I1 obj = new C1();` compiles successfully.

// obj is of I1 type, hence `obj.print("Java");` tries to tag the static ...
// ...method of I1 but static print(String) method of I1 can only be invoked by using I1.print("Java");.

// Therefore, `obj.print("Java");` causes compilation error.
