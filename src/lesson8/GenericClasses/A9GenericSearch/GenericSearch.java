package lesson8.GenericClasses.A9GenericSearch;

import java.util.Comparator;

public class GenericSearch<T> {

    public int linearSearch(T[] array, T key, Comparator<T> comparator) {
        for (int i = 0; i < array.length; i++) {
            if (comparator.compare(array[i], key) == 0) {
                return i; // Return the index if key is found
            }
        }
        return -1; // Return -1 if key is not found
    }

    public int binarySearch(T[] array, T key, Comparator<T> comparator) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int cmp = comparator.compare(array[mid], key);
            if (cmp == 0) {
                return mid; // Return the index if key is found
            } else if (cmp < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1; // Return -1 if key is not found
    }

    public static void main(String[] args) {
        // Example usage with Integer array
        Integer[] intArray = {1, 3, 5, 7, 9, 11};
        GenericSearch<Integer> intSearch = new GenericSearch<>();
        int linearResult = intSearch.linearSearch(intArray, 7, Comparator.naturalOrder());
        int binaryResult = intSearch.binarySearch(intArray, 7, Comparator.naturalOrder());
        System.out.println("Linear Search (Integer): Index of 7 is " + linearResult);
        System.out.println("Binary Search (Integer): Index of 7 is " + binaryResult);

        // Example usage with String array
        String[] stringArray = {"apple", "banana", "grape", "orange"};
        GenericSearch<String> stringSearch = new GenericSearch<>();
        int linearStringResult = stringSearch.linearSearch(stringArray, "banana", Comparator.naturalOrder());
        int binaryStringResult = stringSearch.binarySearch(stringArray, "banana", Comparator.naturalOrder());
        System.out.println("\nLinear Search (String): Index of 'banana' is " + linearStringResult);
        System.out.println("Binary Search (String): Index of 'banana' is " + binaryStringResult);
    }
}
