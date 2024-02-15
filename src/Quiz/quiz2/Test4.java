package Quiz.quiz2;

import java.util.function.Predicate;

public class Test4 {
    public static void main(String[] args) {
        String[] arr = { "A", "ab", "bab", "Aa",
                "bb", "baba", "aba", "Abab" };

        Predicate <String> func = p -> true;
        Predicate <String> func2 = g -> g == "A";
        //predicate is passing ...

        //processStringArray(arr, func);
        // p -> p.length() >= 1)
        // p->p.length()<10
        // p->true
        // p->!false

        processStringArray(arr, func, func2);

    }

    /* private static void processStringArray(String[] arr, Predicate<String> predicate) {
        for (String str : arr) {
            if (predicate.test(str)) { // true
                System.out.println(str);
            }
        }
    } */

    private static void processStringArray(String[] arr, 
    Predicate<String> predicate, Predicate<String> predicate2) {
        for (String str : arr) {
            if (predicate.test(str)) { // true
                System.out.println(str);
            }
            if (predicate2.test(str)) { // true
                System.out.println(str);
            }
        }
    }
}
