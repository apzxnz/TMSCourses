package Homework_2.control_structures;

import utils.ScannerUtils;

public class Rainbow {
    public static void main(String[] args) {
        System.out.println("Введите номер цвета радуги");
        int number = ScannerUtils.sc.nextInt();

        switch (number) {
            case 1:
                System.out.println("Красный");
            case 2:
                System.out.println("Оранжевый");
            case 3:
                System.out.println("Желтый");
            case 4:
                System.out.println("Зеленый");
            case 5:
                System.out.println("Голубой");
            case 6:
                System.out.println("Синий");
            case 7:
                System.out.println("Фиолетовый");
        }
    }
}
