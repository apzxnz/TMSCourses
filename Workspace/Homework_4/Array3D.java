package Homework_4;

import utils.ArraysUtils;
import utils.ScannerUtils;

import java.util.Arrays;

public class Array3D {
    public static void main(String[] args) {

        int[][][] arr3D = ArraysUtils.createAndFill3DArray();
        System.out.println(Arrays.deepToString(arr3D));
        System.out.println("Введите число на которое хотите увеличить каждый элемент массива:");
        int number = ScannerUtils.sc.nextInt();
        arr3D = increaseElementValueIn3DArray(arr3D, number);
        System.out.println(Arrays.deepToString(arr3D));
    }

    public static int[][][] increaseElementValueIn3DArray(int[][][] arr3D, int number) {
        for (int i = 0; i < arr3D.length ; i++) {
            for (int j = 0; j < arr3D[0].length; j++) {
                for (int k = 0; k < arr3D[0][0].length; k++) {
                    arr3D[i][j][k] += number;
                }
            }
        }
        return arr3D;
    }
}
