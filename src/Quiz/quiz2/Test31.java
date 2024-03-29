package Quiz.quiz2;

import java.util.ArrayList;
import java.util.List;

public class Test31 {
    public static void main(String[] args) {
        List<StringBuilder> days = new ArrayList<>();
        days.add(new StringBuilder("Sunday"));       
        days.add(new StringBuilder("Monday"));       
        days.add(new StringBuilder("Tuesday"));
        
        if(days.contains(new StringBuilder("Sunday"))){     //false
            days.add(new StringBuilder("Wednesday"));
        }
        
        System.out.println(days.size());
    }
}

//StringBuilder creates new pointer 

/* public class Test31 {
    public static void main(String[] args) {
        List<StringBuilder> days = new ArrayList<>();
        StringBuilder s = new StringBuilder("Sunday");      //solution
        days.add(s);                                        //solution
        days.add(new StringBuilder("Monday"));       
        days.add(new StringBuilder("Tuesday"));
        
        if(days.contains(s)){                               //true
            days.add(new StringBuilder("Wednesday"));
        }
        
        System.out.println(days.size());
    }
} */