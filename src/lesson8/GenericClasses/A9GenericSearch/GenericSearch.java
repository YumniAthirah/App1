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
}
