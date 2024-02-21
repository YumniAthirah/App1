package Quiz.exam4.exception;

import java.io.IOException;

class Super {
    Super() throws RuntimeException{
        System.out.println("CARPE ");
    }
}

//Super class will run first followed by Sub class
//if : class Sub{..} output : DIEM
class Sub extends Super{                
    Sub() throws IOException{
        System.out.println("DIEM ");
    }
}

public class Test69 {
    public static void main(String[] args) throws Exception {
        new Sub();
    }
}

/* Java compiler adds super(); as the first statement inside Sub class's constructor:
Sub() throws IOException {
super(); //added by the compiler
System.out.println("DIEM");
} */
