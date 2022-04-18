package Lessons;

import java.util.Arrays;
import java.util.Random;

public class ArraysLesson2 {
    public static void main(String[] args) {
        int[][] arr = new int[8][8];
        fillArray(arr);
        printArray(arr);
        System.out.println();
        swapToZeroNotEvenIndexElem(arr);
        printArray(arr);




    }
    private static int[][] fillArray(int[][] arr) {
        Random generator = new Random(15);
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = generator.nextInt(10) + 1;
            }
        }
        return arr;
    }

    private static int[][] swapToZeroNotEvenIndexElem(int[][] arr) {
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (i % 2 != 0 || j % 2 != 0) {
                    arr[i][j] = 0;
                }
            }
        }
        return arr;
    }

    private static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}


