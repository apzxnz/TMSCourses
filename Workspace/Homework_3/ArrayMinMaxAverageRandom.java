package Homework_3;

import utils.ArraysUtils;
import utils.ScannerUtils;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArrayMinMaxAverageRandom {
    public static void main(String[] args) {

        System.out.println("Введите размер массива:");
        int size = ScannerUtils.sc.nextInt();
        int[] arr = ArraysUtils.createAndFillArray(size);
        System.out.println(Arrays.toString(arr) + "\n");
        if (size > 0) {
            System.out.println(findMinMaxAverageNumber(arr));
        } else {
            System.out.println("Размер массива должен быть больше 0");
        }
        
    }

    private static Map<String, Number> findMinMaxAverageNumber(int[] arr) {
        int min = 0, max = 0, sum = 0;
        for (int i = 0; i < arr.length ; i++) {
            if (i == 0) {
                max = arr[i];
                min = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
            sum += arr[i];
        }
        int finalMin = min, finalMax = max;
        double average = sum / arr.length;

        return new HashMap<>() {
            {
                put("min", finalMin);
                put("max", finalMax);
                put("average", average);
            }
        };
    }
}

