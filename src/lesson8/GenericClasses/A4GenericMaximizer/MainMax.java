package lesson8.GenericClasses.A4GenericMaximizer;

import java.util.Arrays;

public class MainMax {
    public static void main(String[] args) {
        //Integer
        Integer[] intArray = { 22, 43, 55, 32, 64};
        Maximizer<Integer> intMaximizer = new Maximizer<>();
        Integer intMax = intMaximizer.findMaximum(intArray);
        System.out.println(Arrays.toString(intArray));
        System.out.println("Maximum value: " + intMax);

        //Double
        Double[] doubleArray = { 2.4, 7.4, 8.5, 4.3, 2.5};
        Maximizer<Double> doubleMaximizer = new Maximizer<>();
        Double doubleMax = doubleMaximizer.findMaximum(doubleArray);
        System.out.println(Arrays.toString(doubleArray));
        System.out.println("Maximum value: " + doubleMax);
    }
}
