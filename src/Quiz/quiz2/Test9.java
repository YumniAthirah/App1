package Quiz.quiz2;

import java.util.ArrayList;

public class Test9 {
    public static void main(String[] args) {
        ArrayList<Integer> original = new ArrayList<>();
        original.add(10);

        ArrayList<Integer> cloned = (ArrayList<Integer>) original.clone();
        Integer i1 = cloned.get(0);
        ++i1;

        System.out.println(cloned);
    }
}
