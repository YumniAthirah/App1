package lesson4.quiz2;

public interface Test19 {
    void m1() throws java.io.IOException;
}

//if you want to use m1, you need to follow the interface provided

//public class C1 implements I1 { public void m1() {} }
//public class C4 implements I1 { public void m1() throws Exception {} }
//public class C2 implements I1 { public void m1() throwsjava.io.FileNotFoundException{} }
//public class C3 implements I1 { public void m1() throws java.io.IOException{} }

/* According to overriding rules, 
if super class / interface method declares to throw a
checked exception, then overriding method of 
sub class / implementer class has following options: */

/* 1. May not declare to throw any checked exception,

2. May declare to throw the same checked exception 
thrown by super class / interfacemethod,

3. May declare to throw the sub class of the exception 
thrown by super class / interface method,

4. Cannot declare to throw the super class of the exception 
thrown by super class /interface method */