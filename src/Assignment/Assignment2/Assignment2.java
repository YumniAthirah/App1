package Assignment.Assignment2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Assignment2 {
    public static void main(String[] args) {
        int len, min, max;

        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

        try {

            // Input length, min and max
            System.out.print("Enter length:");
            len = Integer.parseInt(stdin.readLine());
            System.out.print("Enter min:");
            min = Integer.parseInt(stdin.readLine());
            System.out.print("Enter max:");
            max = Integer.parseInt(stdin.readLine());

            // Generate random number
            System.out.println("\nArray:");
            int[] randoms = genRandomIntArray(len, min, max);
            System.out.println(Arrays.toString(randoms));

            // Sort the array
            System.out.println("\nArray sorted ascendingly:");
            selectionSort(randoms, true); 
            System.out.println(Arrays.toString(randoms));

            // Find mean
            System.out.print("\nmean:");
            double mean = arrayMean(randoms);
            System.out.print(mean);

            // Find mod
            System.out.print("\nmod:");
            int mod = arrayMod(randoms);
            System.out.print(mod);

            // Find median
            System.out.print("\nmedian:");
            double med = arrayMedian(randoms);
            System.out.print(med);

        } catch (NumberFormatException e) {
            // TODO: handle exception
            e.printStackTrace();
        } catch (IOException e) {
            // TODO: handle exception
            e.printStackTrace();
        }

    }

    // Generating random number
    public static int[] genRandomIntArray(int length, int min, int max) {

        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = (int) Math.round(Math.random() * (max - min) + min);
        }
        return arr;
    }

    // Sorting the array (part 1)
    public static void selectionSort(int[] d, boolean inc) {
        int idxToSwap, len = d.length;
        int temp;

        for (int i = 0; i <= (len - 1); i++) {
            int k = i == 0 ? 0 : i - 1;
            if (inc) {
                idxToSwap = findMinIdx(d, k);
            } else {
                idxToSwap = findMaxIdx(d, k);
            }
            temp = d[idxToSwap];
            d[idxToSwap] = d[k];
            d[k] = temp;
        }
    }

    // Sorting the array (part 2)
    public static int findMinIdx(int[] d, int k) {
        int minIdx = k;
        for (int i = k + 1; i < d.length; i++) {
            if (d[i] < d[minIdx]) {
                minIdx = i;
            }
        }
        return minIdx;
    }

    // Sorting the array (part 3)
    public static int findMaxIdx(int[] d, int k) {
        int maxIdx = k;
        for (int i = k + 1; i < d.length; i++) {
            if (d[i] > d[maxIdx]) {
                maxIdx = i;
            }

        }
        return maxIdx;
    }

    // Finding mean
    public static double arrayMean(int[] d) {
        int n = d.length;
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += d[i];
        }

        double mean = sum / n;

        return mean;
    }

    // Finding median
    public static double arrayMedian(int[] d) {
        double med;
        int n = d.length;

        if (n % 2 == 0) {
            int i = (n - 1) / 2;
            int i2 = n / 2;
            med = ((double)d[i] + (double)d[i2]) / 2;
        } else {
            int i = n / 2;
            med = d[i];
        }
        return med;
    }

    // Finding mod
    public static int arrayMod(int[] d) {
        int k, count;
        int n = d.length;
        int maxCount = 0;
        int mod = d[0];

        for (int i = 0; i < n; i++) {
            k = d[i];
            count = 0;
            for (int j = 0; j < n; j++) {
                if (d[j] == k) {
                    count++;
                }
                if (count > maxCount) {
                    maxCount = count;
                    mod = d[i];
                }
            }
        }

        if(maxCount == 1){
            mod = -1;
        }

        return mod;
    }

}
