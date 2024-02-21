package Quiz.exam4;

interface Document {
    default String getType(){       //This keyword specifies that the method has a default implementation within the interface
        return "TEXT";
    }
}

interface WordDocument extends Document{
    String getType();
}

class Word implements WordDocument{

    @Override
    public String getType() {
        return "TEXT";
    }
}

public class Test50 {
    public static void main(String[] args) {
        Document doc = new Word();             // Line n1
        System.out.println(doc.getType());      // Line n2
    }
}

// class Word implements WordDocument and as WordDocument interface has abstract method getType(), 
// and as class Word doesn't implement the getType() method hence it causes compilation failure.
