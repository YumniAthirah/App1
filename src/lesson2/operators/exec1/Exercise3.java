package lesson2.operators.exec1;
//3.String Concatenations (pg4)

public class Exercise3 {
    public static void main(String[] args) {
        String str = "qwertyuiopasdfghjklzxcvbnm";
        String search = "qwerty";                       //searching from string(p1)
        System.out.println(str);
        System.out.println(str.concat(str));            //string + string
        str = str.concat(str);
        System.out.println(str);
        System.out.println(str.charAt(5));        //index's charecter
        System.out.println(str.length());               //sting's length
        if(str.contains(search)){
            System.out.printf("Contains %s", search);   //searching from string(p2)
        }
        else {
            System.out.printf("Does not contain %s", search);
        }

    }
}
