package Homework_10.employee;

import Homework_10.Position;
import lombok.Getter;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.Period;
import java.time.YearMonth;
import java.time.temporal.ChronoUnit;

@Getter
public abstract class Employee {

    protected final String firstName;
    protected final String lastName;
    protected final Position position;
    protected final LocalDate dateOfHiring;

    protected final double basicSalaryRate = 500;


    public Employee(String firstName, String lastName, Position position, LocalDate dateOfHiring) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.dateOfHiring = dateOfHiring;
    }

    public Employee(String firstName, String lastName, Position position) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.dateOfHiring = LocalDate.now();
    }

    public BigDecimal getWorkExperienceRatio() {
        LocalDate current = LocalDate.now();
        long monthsBetween = ChronoUnit.MONTHS.between(
                YearMonth.from(dateOfHiring),
                YearMonth.from(current)
        );
        double result = monthsBetween / 12.0;
        return new BigDecimal(result).setScale(2, RoundingMode.HALF_UP);
    }

    public String getInfoWorkExperience() {
        LocalDate current = LocalDate.now();
        Period workPeriod = Period.between(dateOfHiring, current);
        return workPeriod.getYears() + " г. " + workPeriod.getMonths() + " м. " + workPeriod.getDays() + " д.";
    }

    public BigDecimal getWorkExperience() {
        LocalDate current = LocalDate.now();
        long monthsBetween = ChronoUnit.MONTHS.between(
                YearMonth.from(dateOfHiring),
                YearMonth.from(current)
        );
        double result = monthsBetween / 12.0;
        return new BigDecimal(result).setScale(2, RoundingMode.HALF_UP);
    }

    public BigDecimal getSalary() {
        // Немного изменил начальное тз
        // по первоначальной формуле, если сотрудник работает < 1 года, то зарплата либо 0 либо базовая ставка уменьшается.
        // по этому мое предложение - формировать суммарный коэф между коэфом по должности и опыта работы
        return new BigDecimal(basicSalaryRate * (position.getRatio() + getWorkExperience().doubleValue())).setScale(2, RoundingMode.HALF_UP);
    }

    @Override
    public String toString() {
        return  lastName + " " + firstName + " (" +
                "Должность: " + position.toString() + ";" +
                " Зарплата: " + getSalary() + " BYN;" +
                " Дата приема на работу: " + dateOfHiring.toString() + ";" +
                " Стаж (коэффициент): " + getWorkExperienceRatio() + ";" +
                " Стаж (информация): " + getInfoWorkExperience() + ")";
    }

}
