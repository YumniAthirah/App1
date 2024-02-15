package lesson8.GenericClasses.A9GenericSearch;

import java.util.Comparator;

public class MainSearch {
    public static void main(String[] args) {
        //Integer array
        Integer[] intArray = {4, 25, 13, 23, 52};
        GenericSearch<Integer> intSearch = new GenericSearch<>();
        int linearResult = intSearch.linearSearch(intArray, 23, Comparator.naturalOrder());
        int binaryResult = intSearch.binarySearch(intArray, 23, Comparator.naturalOrder());
        System.out.println("Linear Search (Integer): Index of 23 is " + linearResult);
        System.out.println("Binary Search (Integer): Index of 23 is " + binaryResult);

        // String array
        String[] stringArray = {"Tokyo", "Shiga", "Himeji", "Hokkaido"};
        GenericSearch<String> stringSearch = new GenericSearch<>();
        int linearStringResult = stringSearch.linearSearch(stringArray, "Shiga", Comparator.naturalOrder());
        int binaryStringResult = stringSearch.binarySearch(stringArray, "Shiga", Comparator.naturalOrder());
        System.out.println("\nLinear Search (String): Index of 'Shiga' is " + linearStringResult);
        System.out.println("Binary Search (String): Index of 'Shiga' is " + binaryStringResult);
    }
}
