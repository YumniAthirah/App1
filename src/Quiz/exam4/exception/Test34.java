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
