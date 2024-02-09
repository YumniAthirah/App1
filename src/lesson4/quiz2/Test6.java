package lesson4.quiz2;

public class Test6 {
    public static void main(String[] args) {
        CharSequence cha = "char";
        String iStr = new String("asdfgad");
        
        m1(cha);
        
        //null = absence of value
        //no value, thus the program cant detect it is charseq or object
        //so it output String
        m1(null);            
        
        m1("String");
        m1(iStr);

        m1('a');
    }

    static void m1(CharSequence s){
        System.out.println("CharSequence");
    }

    static void m1(String s){
        System.out.println("String");
    }

    static void m1(Object s){
        System.out.println("Object");
    }
    
}
