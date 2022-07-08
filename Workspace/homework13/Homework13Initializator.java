package homework13;

import java.util.*;

/** 1) Создать класс User с полями: имя, пол, возраст
2) Для данного класса переопределить методы hashCode и equals.
3) Указать что класс User имплементирует интерфейс Comparable. Сравнение пользователей должно учитывать возраст и имя (при одинаковом возрасте - сравнивать первые буквы имени)
4) Создать несколько объектов типа User и поместить их в каждую коллекцию (list и set)
5) Cоздать сервис, который:
осуществляем поиск пользователя по имени (учитывает дубликаты)
возвращает коллекцию пользователей на основе пола.
возвращает отсортированную коллекцию по возрасту пользователей.
6) Заменить одну реализацию списка на другую. Убедиться, что сервис работает корректно.


Задан массив из целых чисел, в котором присутствуют повторения.
В данном массиве найти число, которое встречается максимальное число раз. Решение реализовать на основе Map **/


public class Homework13Initializator {
    public static void main(String[] args) {
        taskCollection();
        int maxContainsNumber = taskArrayMaxContainsCount();
        System.out.printf("Число, которое встречается максимальное кол-во раз -> %d \n", maxContainsNumber);

        maxContainsNumber = taskArrayMaxContainsCountMap();
        System.out.printf("Число, которое встречается максимальное кол-во раз (Map) -> %d \n", maxContainsNumber);
    }

    public static void taskCollection() {
        User user1 = new User("Petya", 20, 'M');
        User user2 = new User("Masha", 19, 'W');
        User user3 = new User("Andrey", 30, 'M');
        User user4 = new User("Masha", 21, 'W');
        User user5 = new User("Misha", 20, 'M');

        ArrayList<User> userList = new ArrayList<>(Arrays.asList(user1, user2, user3, user4, user5));
        HashSet<User> userSet = new HashSet<>(userList);
        UserService userService = new UserService();

        System.out.println(userService.findUsersByName("Masha", userSet));
        System.out.println(userService.findUsersBySex('M', userSet));
        System.out.println(userService.sortUsersByAge(userSet));
    }

    public static int taskArrayMaxContainsCount() {
        int[] numbers = new int[]{1,2,2,3,4};
        int[] numbersCount = new int[5];
        int indexNumber = 0;

        for (int i = 0; i < numbers.length; i++) {
            int count = 0;
            for (int number : numbers) {
                if (numbers[i] == number) {
                    count++;
                }
            }
            numbersCount[i] = count;
            if (i > 0) {
                if (numbersCount[i] > numbersCount[i-1]) {
                    indexNumber = i;
                }
            }
        }

        return numbers[indexNumber];
    }

    public static int taskArrayMaxContainsCountMap() {
        int[] numbers = new int[]{1,2,2,3,4};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int j : numbers) {
            int count = 0;
            for (int number : numbers) {
                if (j == number) {
                    count++;
                }
            }
            map.put(j, count);
        }

        return Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getValue();
    }
}
