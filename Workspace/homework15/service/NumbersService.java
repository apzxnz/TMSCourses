package service;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class NumbersService {

    public ArrayList<Integer> removeDuplicates(ArrayList<Integer> numbers) {
        return numbers.stream().distinct().collect(Collectors.toCollection(ArrayList::new));
    }

    public ArrayList<Integer> getEvenNumberFrom7To17Interval(ArrayList<Integer> numbers) {
        return numbers.stream().filter(elem -> elem % 2 == 0 && elem >= 7 && elem <= 17)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public ArrayList<Integer> increaseElementsBy2(ArrayList<Integer> numbers) {
        return numbers.stream().map(elem -> elem * 2).collect(Collectors.toCollection(ArrayList::new));
    }

    public ArrayList<Integer> sortAndGetFirst4Elements(ArrayList<Integer> numbers) {
        return numbers.stream().sorted().limit(4).collect(Collectors.toCollection(ArrayList::new));
    }

    public long getCountNumbers(ArrayList<Integer> numbers) {
        return numbers.stream().count();
    }

    public double getAverage(ArrayList<Integer> numbers) {
        return numbers.stream().mapToInt(elem -> elem).average().getAsDouble();
    }

}
