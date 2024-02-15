package Quiz.quiz2;

import java.io.FileNotFoundException;
import java.io.IOException;

abstract class Super {
    public abstract void m1() throws IOException;
}

class Sub extends Super{
    @Override
    public void m1() throws IOException{
        throw new FileNotFoundException();
    }
}

public class Test13 {
    public static void main(String[] args) {
        Super s = new Sub();
        try {
            s.m1();
        } catch (FileNotFoundException e) {     //because of hieararchy of Exception
            // TODO: handle exception
            System.out.println("B");
        } catch (IOException e) {
            // TODO: handle exception
            System.out.println("A");
        /* } catch (FileNotFoundException e) {     //because of hieararchy of Exception
            // TODO: handle exception
            System.out.println("B"); */
        } finally {
            // TODO: handle exception
            System.out.println("C");
        }
    }
}



