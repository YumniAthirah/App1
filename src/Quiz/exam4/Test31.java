package Quiz.exam4;

abstract class Log{
    abstract long count();     //Line n1 
    abstract Object get();     //Line n2
}

class CommunicationLog extends Log{
    //int count(){            //Line n3 : compilation error bcoz [Line n1] returns long
    long count(){           
        return 100;
    }
    String get(){             //Line n4 : String is a subclass of Object, so it is a case of covariant return type 
        return "COM-LOG";
    }
}
public class Test31 {
    public static void main(String[] args) {
        Log log = new CommunicationLog();
        System.out.println(log.count());
        System.out.println(log.get());
    }
}

// 1. If return type of overridden method is of primitive type, then overriding method should use same primitive type.
// 2. If return type of overridden method is of reference type, then overriding method can use same reference type or 
// its sub-type (also known as covariant return type).
