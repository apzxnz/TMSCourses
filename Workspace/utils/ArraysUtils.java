package utils;

import java.util.Random;


public class ArraysUtils {
    public static int[] createAndFillArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 7);
        }
        return arr;
    }
}
