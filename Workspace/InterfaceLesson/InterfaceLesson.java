package InterfaceLesson;

import InterfaceLesson.converter.CelsiusToFarenConverter;
import InterfaceLesson.converter.CelsiusToKelvinСonverter;
import InterfaceLesson.converter.IConverter;
import utils.ScannerUtils;

import java.util.Scanner;


public class InterfaceLesson {
    public static void main(String[] args) {
        System.out.println("Введите кол-во градусов Цельсия:");
        int temp = ScannerUtils.sc.nextInt();
        System.out.println("Укажите единицы в которые вы хотите перевести");
        String type = new Scanner(System.in).nextLine();

        IConverter iConverter = null;


        switch (ImplConverterEnum.valueOf(type)) {
            case KELVIN: iConverter = new CelsiusToKelvinСonverter(); break;
            case FAREN: iConverter = new CelsiusToFarenConverter(); break;
            default: break;
        }

        if (iConverter == null) {
            System.out.println("Конвертера с таким типом нету");
        } else {
            System.out.printf("%d - градусов Цельсия = %s - %s", temp, String.format("%.2f", iConverter.convert(temp)), iConverter.getCode());
        }

    }
}
