package lesson8.Assignment.A4;

import java.util.Arrays;

public class MainSortable {
    public static void main(String[] args) {
        int[] array = {3, 6, 8, 2, 4, 7};

        BubbleSort bubbleSort = new BubbleSort();
        SelectionSort selectionSort = new SelectionSort();
        InsertionSort insertionSort = new InsertionSort();

        System.out.println("Original array: " + Arrays.toString(array));

        long startTime = System.nanoTime();
        bubbleSort.sort(array);
        long endTime = System.nanoTime();
        System.out.println("Bubble sort: " + Arrays.toString(array) + " (Time: " + (endTime - startTime) + " ns)");

        startTime = System.nanoTime();
        selectionSort.sort(array);
        endTime = System.nanoTime();
        System.out.println("Selection sort: " + Arrays.toString(array) + " (Time: " + (endTime - startTime) + " ns)");

        startTime = System.nanoTime();
        insertionSort.sort(array);
        endTime = System.nanoTime();
        System.out.println("Insertion sort: " + Arrays.toString(array) + " (Time: " + (endTime - startTime) + " ns)");
    }
}
