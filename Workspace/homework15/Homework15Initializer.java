import family.Children;
import family.Family;
import family.FamilyLastNameNotUniqueException;
import service.FamilyService;
import service.NumbersService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Homework15Initializer {
    public static void main(String[] args) throws FamilyLastNameNotUniqueException {
        taskNumberStreams();
        taskFamilyStreams();

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

    public static void taskFamilyStreams() throws FamilyLastNameNotUniqueException {
        FamilyService familyService = new FamilyService();

        Family family1 = new Family("petrovi", "12-1", 1250.30);
        family1.getChildrens().add(new Children("karl", 'm', 15));
        family1.getChildrens().add(new Children("olga", 'w', 12));

        Family family2 = new Family("ivanovi", "11-35", 500.00);
        family2.getChildrens().add(new Children("jenya", 'm', 20));
        family2.getChildrens().add(new Children("petya", 'm', 7));
        family2.getChildrens().add(new Children("masha", 'w', 19));

        Set<Family> families = new HashSet<>(Arrays.asList(family1, family2));

        System.out.println(familyService.generateMapLastNameSalary(families));
        System.out.println(familyService.countMaleChildren(families));
        System.out.println(familyService.getFemaleChildren(families));
        System.out.println(familyService.generateMapLastNameCountChildren(families));
        System.out.println(familyService.checkFamilyWhoHasAChildWithName("masha", families));

    }
}
