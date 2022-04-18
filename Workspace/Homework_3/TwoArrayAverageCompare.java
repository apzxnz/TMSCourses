package Homework_3;

import utils.ArraysUtils;
import utils.ScannerUtils;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoArrayAverageCompare {
    public static void main(String[] args) {

        int[] arr1 = ArraysUtils.createAndFillArray(5);
        int[] arr2 = ArraysUtils.createAndFillArray(5);
        System.out.println(Arrays.toString(arr1) + "\n");
        System.out.println(Arrays.toString(arr2) + "\n");
        double average1 = calculateAverage(arr1);
        double average2 = calculateAverage(arr2);
        System.out.printf("Среднее арифм. первого массива - %f, среднее арифм. второго массива - %f \n", average1, average2);
        if (average1 > average2) {
            System.out.println("Среднее арифм. первого массива больше");
        } else if (average1 == average2) {
            System.out.println("Средние арифм. равны");
        } else {
            System.out.println("Среднее арифм. второго массива больше");
        }

        
    }

    private static double calculateAverage(int[] arr) {
        int sum = 0; double average = 0;
        for (int j : arr) {
            sum += j;
        }
        average = sum / arr.length;

        return average;
    }
}

