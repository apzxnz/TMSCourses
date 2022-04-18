package Homework_2.control_structures;


import utils.ScannerUtils;

public class EvenOrNot {
    public static void main(String[] args) {
        System.out.println("Введите число");
        int number = ScannerUtils.sc.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " - четное число");
        } else {
            System.out.println(number + " - нечетное число");
        }

    }
}
