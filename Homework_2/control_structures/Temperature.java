package control_structures;

import utils.ScannerUtils;

public class Temperature {
    public static void main(String[] args) {
        System.out.println("Введите температуру на улице");
        int number = ScannerUtils.sc.nextInt();

        if (number > -5 && number <= 25) {
            System.out.println("Тепло");
        } else if (number <= -5 && number > -20) {
            System.out.println("Нормально");
        } else if (number > 25) {
            System.out.println("Жесткач");
        } else {
            System.out.println("Холодно");
        }

    }
}
