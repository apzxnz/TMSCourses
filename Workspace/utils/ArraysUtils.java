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

    public static int[][][] createAndFill3DArray() {
        Random generator = new Random(15);
        int[][][] arr3D = new int[2][2][2];

        for (int i = 0; i < arr3D.length ; i++) {
            for (int j = 0; j < arr3D[0].length; j++) {
                for (int k = 0; k < arr3D[0][0].length; k++) {
                    arr3D[i][j][k] = generator.nextInt(10) + 1;
                }
            }
        }
        return arr3D;
    }
}
