package utils;

import java.util.Random;


public class ArraysUtils {
    public static int[] createAndFillArray(int size) {
        Random r = new Random(15);
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(15);
        }
        return arr;
    }
}
