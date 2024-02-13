package lesson4.quiz2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Test15 {
    public static void main(String[] args) {
        List<String> dryfruits = new ArrayList<>();
        dryfruits.add("Walnut");
        dryfruits.add("Apricot");
        dryfruits.add("Almond");
        dryfruits.add("Date");

        ListIterator<String> iterator = dryfruits.listIterator();
    while(iterator.hasNext()){
        if(iterator.next().startsWith("A")){
            iterator.remove();
        }
    }

    System.out.println(dryfruits);

    }
}
