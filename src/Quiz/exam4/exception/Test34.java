package Quiz.exam4.exception;

import java.io.FileNotFoundException;
import java.io.IOException;

class Base{
    Base() throws IOException{
        System.out.println(1);
    }
}

/* class Derived extends Base {
    Derived() throws FileNotFoundException {
        System.out.println(2);
    }
} */

class Derived extends Base {
    Derived() throws IOException {
        super();
        System.out.println(2);
    }
}

public class Test34 {
    public static void main(String[] args) throws Exception {
        new Derived();
    }
}

// As super(); invokes the constructor of Base class (which declares to throw IOException), 
// compiler complains as [Derived class no-argument constructor doesn't declare to throw IOException]. 
// It declares to throw FileNotFoundException (subclass of IOException),
// which is not enough for the instances of IOException.
