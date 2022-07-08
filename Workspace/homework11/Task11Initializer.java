import exceptions.FiveElementsLimitException;
import exceptions.GetFromEmptyInputStorageException;

import java.util.Arrays;

/**
Необходимо создать приложение, которое будет в цикле обрабатывать пользовательский ввод и уведомлять пользователся об внутренних ошибках.
Если пользователь вводит слово exit - программа завершается
Если пользователь вводит get - программа из памяти возвращает и удаляет элемент (строку)
Если пользователь вводит что-то иное - то данная строка сохраняется в память

Задание:

1) Реализовать обработку пользовательского ввода
2) Создать сервис для хранения ввода (массив или коллекция)
3) При превышении 5 элементов - возвращать информацию об ошибке пользователю (бросать исключение)
4) Если память пуста и пользователь хочет получить данные - показывать ошибку (память пуста)
5) Если пользователь забрал данные, то эти данные удаляются из хранилища (FIFO - первым зашел - первым вышел)
**/

public class Task11Initializer {

    public static void main(String[] args) throws FiveElementsLimitException, GetFromEmptyInputStorageException {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        InputStorage inputStorage = new InputStorage();
        System.out.println("Введите текст:");
        String data;
        do {
            data = sc.nextLine();
            if (!data.equals("get") && !data.equals("exit")) {
                inputStorage.saveEnteredString(data);
                System.out.println(Arrays.toString(inputStorage.getEnteredStrings()));
            } else if (data.equals("get")){
                String takenString = inputStorage.getEnteredString();
                System.out.println("Полученная строка -> " + takenString);
                System.out.println(Arrays.toString(inputStorage.getEnteredStrings()));
            } else {
                System.out.println(Arrays.toString(inputStorage.getEnteredStrings()));
            }
        } while (!data.equals("exit") && sc.hasNext());
    }
}
