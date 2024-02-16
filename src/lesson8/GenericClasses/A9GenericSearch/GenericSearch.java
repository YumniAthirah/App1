package lesson8.GenericClasses.A9GenericSearch;

import java.util.Comparator;

public class GenericSearch<T> {

    //smaller size array better t use linear search
    //larger size array use binary search, because the array will reduce the size

    public int linearSearch(T[] array, T value, Comparator<T> comparator) {
        for (int i = 0; i < array.length; i++) {
            if (comparator.compare(array[i], value) == 0) {
                return i; //return the index if value is found
            }
        }
        return -1; //return -1 if value is not found
    }

    //requires the array to be sorted
    public int binarySearch(T[] array, T value, Comparator<T> comparator) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int cmp = comparator.compare(array[mid], value);
            if (cmp == 0) {
                return mid; //return the index if value is found
            } else if (cmp < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1; //return -1 if value is not found
    }
}
