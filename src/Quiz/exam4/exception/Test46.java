package Quiz.exam4.exception;

import java.util.*;

class A{}
class B extends A{}

abstract class Super{
    abstract List<A> get() throws IndexOutOfBoundsException;
}

abstract class Sub extends Super{
    abstract List<A> get() throws ArrayIndexOutOfBoundsException;
    //[o]returns the same return type List<A>
    //[o]allowed to throw any RuntimeException(ArrayIndexOutOfBoundsException)

    //abstract ArrayList<B> get();                    
    //[x]List<B> is not subtype of List<A>
    
    //abstract ArrayList<A> get() throws Exception;   
    //[x]overriding method is not allowed t declare checked Exception
    //[x]Class Exception and its subclasses are checked exceptions

    //abstract List<B> get();
    //[x]ArrayList<B> is not subtype of List<A>    
}

public class Test46 {
    
}
