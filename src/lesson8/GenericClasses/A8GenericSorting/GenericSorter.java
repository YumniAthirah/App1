package lesson8.GenericClasses.A8GenericSorting;

import java.util.Comparator;

public class GenericSorter<T> {
    public void sort(T[] array, Comparator<T> comparator) {
        quicksort(array, comparator, 0, array.length - 1);
    }

    // Quicksort algorithm implementation
    private void quicksort(T[] array, Comparator<T> comparator, int low, int high) {
        if (low < high) {
            int partitionIndex = partition(array, comparator, low, high);
            quicksort(array, comparator, low, partitionIndex - 1);
            quicksort(array, comparator, partitionIndex + 1, high);
        }
    }

    private int partition(T[] array, Comparator<T> comparator, int low, int high) {
        T pivot = array[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (comparator.compare(array[j], pivot) <= 0) {
                i++;
                swap(array, i, j);
            }
        }
        swap(array, i + 1, high);
        return i + 1;
    }

    private void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        // Example usage with Integer array
        Integer[] intArray = {3, 1, 5, 2, 4};
        GenericSorter<Integer> intSorter = new GenericSorter<>();
        intSorter.sort(intArray, Comparator.naturalOrder());
        System.out.println("Sorted Integer Array: " + java.util.Arrays.toString(intArray));
        
        // Example usage with String array
        String[] stringArray = {"banana", "apple", "grape", "orange"};
        GenericSorter<String> stringSorter = new GenericSorter<>();
        stringSorter.sort(stringArray, Comparator.naturalOrder());
        System.out.println("Sorted String Array: " + java.util.Arrays.toString(stringArray));
    }

}
