package Homework_3;

import utils.ArraysUtils;
import utils.ScannerUtils;

import java.util.Arrays;

public class ArrayContainsIntNumber {
    public static void main(String[] args) {

        System.out.println("Введите число которое хотите найти в массиве:");
        int number = ScannerUtils.sc.nextInt();
        int[] arr = ArraysUtils.createAndFillArray(5);
        System.out.println(Arrays.toString(arr) + "\n");
        if (arrayContainsNumber(arr, number))  {
            System.out.println("Массив содержит число");
        } else {
            System.out.println("Массив не содержит число");
        }
    }

    private static boolean arrayContainsNumber(int[] arr, int number) {
        for (int i : arr) {
            if (i == number) {
                return true;
            }
        }
        return false;
    }

}
