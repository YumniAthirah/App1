package lesson8.GenericClasses.A10GenericAlgorithm;

import java.util.Arrays;

public class Algorithm<T extends Comparable<T>> {
    
    public void execute(T[] input){
        Arrays.sort(input);
        System.out.println("Array after sorting: " + Arrays.toString(input));
    }

    //search
    /* public void execute(T[] input, T value){
        if(!isSorted(input)){
            Arrays.sort(input);
            System.out.println("\nArray sorted for searching: " + Arrays.toString(input));
        }

        int index = binarySearch(input, value);

        if(index != -1){
            System.out.println("Element " + value + " found at index " + index);
        } else {
            System.out.println("Element " + value + " not found");
        }
    } */

}
