package Quiz.exam4;

interface M {
    public static void log() {
        System.out.println("M");
    }
}

abstract class A {
    public static void log() {
        System.out.println("N");
    }
}

class MyClass extends A implements M {
}

public class Test19 {
    public static void main(String[] args) {
        M obj1 = new MyClass();
        //obj1.log();                   // Line n1  
        M.log();                     
        // error bcoz static log() method of M is limited to.. 
        // ...interface M and it can be invoked by using Interface name only, M.log().

        A obj2 = new MyClass();
        obj2.log();                     //Line n2

        MyClass obj3 = new MyClass();
        obj3.log();                     //Line n3
    }
}

// There are different ways in which static method of an abstract class can be accessed:
// 1. By using the name of the abstract class: A.log(); //Preferred way
// 2. By using the reference variable of abstract class: A o1 = null; o1.log();
// 3. By using the name of the subclass: MyClass.log();
// 4. By using the reference variable of the subclass: MyClass o2 = null; o2.log();
// Hence, Line n2 and Line n3 compile successfully.