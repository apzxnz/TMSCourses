package Homework_10.employee;

import Homework_10.Position;
import lombok.Getter;
import lombok.ToString;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

@Getter
public class Director extends Employee {

    private final Set<Employee> subordinateEmployees;

    public Director(String firstName, String lastName, Position position, LocalDate dateOfHiring, Set<Employee> subordinateEmployees) {
        super(firstName, lastName, position, dateOfHiring);
        this.subordinateEmployees = subordinateEmployees;
    }

    public Director(String firstName, String lastName, Position position, Set<Employee> subordinateEmployees) {
        super(firstName, lastName, position);
        this.subordinateEmployees = subordinateEmployees;
    }

    public Director(String firstName, String lastName, Position position, LocalDate dateOfHiring) {
        super(firstName, lastName, position, dateOfHiring);
        subordinateEmployees = new HashSet<>();
    }

    public Director(String firstName, String lastName, Position position) {
        super(firstName, lastName, position);
        subordinateEmployees = new HashSet<>();
    }

    public void addWorker(Employee employee) {
        int sizeBeforeAdd = subordinateEmployees.size();
        subordinateEmployees.add(employee);
        if (sizeBeforeAdd == subordinateEmployees.size()) {
            System.err.printf("Сотрудник (%s) не был добавлен в подчинение директора (%s), так-как он уже у него в подчинении\n",
                    employee.lastName + " " + employee.firstName, this.lastName + " " + this.firstName
            );
        }
    }

    @Override
    public BigDecimal getSalary() {
        return new BigDecimal(
                basicSalaryRate * (position.getRatio() + getWorkExperience().doubleValue() + getSubordinateEmployees().size())
        ).setScale(2, RoundingMode.HALF_UP);
    }

    @Override
    public String toString() {
        return  "----------------------------------------------------------------------------------\n" +
                super.toString() + "\n----------------------------------------------------------------------------------" +
                subordinateEmployees.stream().sorted(Comparator.comparing(Employee::getPosition).reversed())
                        .map(employee -> "\n" + employee)
                        .collect(Collectors.joining());
    }
}
