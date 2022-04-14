import java.util.Arrays;
import java.util.Random;

public class ArraysLesson2Task2 {
    public static void main(String[] args) {
        int[][] arr = new int[4][4];
        fillArray(arr);


        System.out.println();
        //swapToZeroNotEvenIndexElem(arr);
        printArray(arr);

        findMaxAbsMultiplyRow(arr);




    }
    private static void fillArray(int[][] arr) {
        Random generator = new Random(9);
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = generator.nextInt(10) + 1;
            }
        }
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
        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }
    }

    private static void findMaxAbsMultiplyRow(int[][] arr) {
        int elemIndexMax = 0;
        int elemMaxMultiplyResult = 0;

        for (int i = 0; i < arr.length ; i++) {
            int multiplyResult = 1;
            for (int j = 0; j < arr[0].length; j++) {
                multiplyResult *= Math.abs(arr[i][j]);
            }
            if (multiplyResult > elemMaxMultiplyResult) {
                elemIndexMax = i;
                elemMaxMultiplyResult = multiplyResult;
            }
        }

        System.out.printf("Индекс строки c наибольшим по модулю произведением элементов: %d\n", elemIndexMax);
        System.out.printf("Произведение данной строки: %d", elemMaxMultiplyResult);

    }
}


