package lesson8.GenericClasses.A8GenericSorting;

import java.util.Comparator;

public class MainSorter {
    public static void main(String[] args) {
        // Integer array
        Integer[] intArray = {4, 25, 13, 23, 52};
        GenericSorter<Integer> intSorter = new GenericSorter<>();
        intSorter.sort(intArray, Comparator.naturalOrder());
        System.out.println("Sorted Integer Array: " + java.util.Arrays.toString(intArray));
        
        // String array
        String[] stringArray = {"Tokyo", "Shiga", "Himeji", "Hokkaido"};
        GenericSorter<String> stringSorter = new GenericSorter<>();
        stringSorter.sort(stringArray, Comparator.naturalOrder());
        System.out.println("Sorted String Array: " + java.util.Arrays.toString(stringArray));
    }
}
