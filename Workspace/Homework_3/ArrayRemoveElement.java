package Homework_3;

import utils.ArraysUtils;
import utils.ScannerUtils;

import java.util.Arrays;

public class ArrayRemoveElement {
    public static void main(String[] args) {

        int[] arr = ArraysUtils.createAndFillArray(10);
        System.out.println(Arrays.toString(arr) + "\n");

        System.out.println("Введите число которое хотите найти и удалить в массиве:");
        int number = ScannerUtils.sc.nextInt();

        int index = arrayContainsNumber(arr, number);
        while (index != -1) {
            arr = removeElementFromArray(arr, index);
            index = arrayContainsNumber(arr, number);
        }

        System.out.println(Arrays.toString(arr));

    }



    private static int[] removeElementFromArray(int[] arr, int index) {
        int[] newArray = new int[arr.length - 1];
        for (int i = 0, k = 0; i < arr.length; i++) {
            if (i == index) {
                continue;
            }
            newArray[k++] = arr[i];
        }
        return newArray;
    }

    private static int arrayContainsNumber(int[] arr, int number) {
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] == number) {
                return i;
            }
        }
        return -1;
    }

}
