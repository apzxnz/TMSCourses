import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.WeekFields;
import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;

public class Homework14Initializer {
    public static void main(String[] args) {
        getDayOfWeekNameFromEnteredStringDate("05.06.2022");
        getDateNextTuesday();
        taskFuncInterfaces();
    }

    public static void getDayOfWeekNameFromEnteredStringDate(String enteredDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate date = LocalDate.parse(enteredDate, formatter);
        System.out.println(date.getDayOfWeek().toString());
    }

    public static void getDateNextTuesday() {
        DayOfWeek dayOfWeek = DayOfWeek.of(2);
        LocalDate date = LocalDate.now();
        date = date.with(TemporalAdjusters.next(DayOfWeek.TUESDAY));
        System.out.println(date);
    }

    public static void taskFuncInterfaces() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Введите число:");
        int input = sc.nextInt();
        if (input == 1) {
            String enteredString = "hello world!";
            FuncInterface<String> stringReverser = text -> new StringBuilder(text).reverse().toString();
            System.out.println(
                    stringReverser.process(enteredString)
            );
        } else {
            int numberForFact = 4;
            FuncInterface<Integer> factCalculator = number -> {
                int factRes = 1;
                for (int i = 1; i <= number; i++) {
                    factRes = factRes * i;
                }
                return factRes;
            };
            System.out.println(
                    factCalculator.process(numberForFact)
            );

        }

    }
}
