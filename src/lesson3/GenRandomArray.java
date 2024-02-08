package lesson3;

import java.util.Arrays;
import java.util.Random;

public class GenRandomArray {

    public static void main(String[] args) {
        int len = 5;   //length
        int min = 10;
        int max = 15;
        int[] randoms = genRandomIntArray(len, min, max);       //declare an array named randoms
        System.out.println(Arrays.toString(randoms));
    }

    public static int[] genRandomIntArray(int length, int min, int max){ //generate random numbers based on the length, min and max
        int [] arr = new int[length];                                    //declare an array named arr with (length) elements
        for (int i = 0; i < length; i++){                                //to generate only (length) elements
            arr[i] = (int) Math.round(Math.random() * (max - min));      //to generate random (whole) numbers but in the range of min-max  
            // 0 1 => e.g. 0.534 
        }
        return arr;
    }

    //Random() is pseudorandom
    public static int[] genRandomIntArray2(int length, int min, int max){ //generate random numbers based on the length, min and max
        int [] arr = new int[length]; 
        Random random = new Random();
        
        for (int i = 0; i < length; i++){
            int rand = random.nextInt(max);
            arr[i] = rand > min ? rand : rand + min;
        }
        return arr;
    }

    

}
