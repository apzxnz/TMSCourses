package Homework_2.cycles;

import utils.ScannerUtils;

public class SummScannerNumber {
    public static void main(String[] args) {
        int number = ScannerUtils.sc.nextInt(), sum = 0;
        for (int i = 0; i < number; i++) {
            sum += i;
        }
        System.out.println(sum);

    }
}
