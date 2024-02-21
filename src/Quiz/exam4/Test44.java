package Quiz.exam4;

class Super {
    public String num = "10";       //Line n1
}

class Sub extends Super{
    protected int num = 20;         //Line n2 : hides the num variable from the superclass
}

public class Test44 {
    public static void main(String[] args) {
        Super obj = new Sub();
        System.out.println(obj.num += 2);

        Sub obj2 = new Sub();
        System.out.println(obj2.num += 2);
    }
}

// Subclass overrides the methods of superclass but it hides...
// ...the variables of superclass.

// 'obj' is of Super type, hence obj.num refers to num variable at..
// ...Line n1, which is of String type.
