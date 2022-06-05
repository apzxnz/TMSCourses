import service.NumbersService;

import java.util.ArrayList;

public class Homework15Initializer {
    public static void main(String[] args) {
        taskNumberStreams();

    }
    public static void taskNumberStreams() {
        ArrayList<Integer> numbers = new ArrayList<>();
        NumbersService numbersService = new NumbersService();
        for (int i = 0; i < 25; i++) {
            numbers.add((int) (Math.random() * 20 + 1));
        }
        System.out.println(numbers);
        System.out.println(numbersService.removeDuplicates(numbers));
        System.out.println(numbersService.getEvenNumberFrom7To17Interval(numbers));
        System.out.println(numbersService.increaseElementsBy2(numbers));
        System.out.println(numbersService.sortAndGetFirst4Elements(numbers));
        System.out.println(numbersService.getCountNumbers(numbers));
        System.out.println(numbersService.getAverage(numbers));

    }
}
