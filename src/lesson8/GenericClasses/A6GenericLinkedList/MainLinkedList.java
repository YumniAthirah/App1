package lesson8.GenericClasses.A6GenericLinkedList;

public class MainLinkedList {
    public static void main(String[] args) {
        //Integer
        GenericLinkedList<Integer> intList = new GenericLinkedList<>();
        intList.add(48);
        intList.add(63);
        System.out.println("Integer List: " + intList.isEmpty());
        intList.remove(48);
        System.out.println("Remove 48 from Integer List: " + intList.isEmpty());
        intList.remove(63);
        System.out.println("Remove 63 from Integer List: " + intList.isEmpty());

        //String
        GenericLinkedList<String> stringList = new GenericLinkedList<>();
        stringList.add("Happy");
        stringList.add("Birthday");
        System.out.println("String List: " + stringList.isEmpty());
        stringList.remove("Birthday");
        System.out.println("Remove Birthday from String List: " + intList.isEmpty());

        //Char
        GenericLinkedList<Character> charList = new GenericLinkedList<>();
        charList.add('I');
        charList.add('L');
        charList.add('Y');
        System.out.println("Character List: " + charList.isEmpty());
        charList.remove('L');
        System.out.println("Remove L from Character List: " + charList.isEmpty());
    }
}
