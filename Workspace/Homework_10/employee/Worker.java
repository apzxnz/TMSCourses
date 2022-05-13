package Homework_10.employee;

import Homework_10.Position;

import java.time.LocalDate;

public class Worker extends Employee {

    public Worker(String firstName, String lastName, Position position, LocalDate dateOfHiring) {
        super(firstName, lastName, position, dateOfHiring);
    }

    public Worker(String firstName, String lastName, Position position) {
        super(firstName, lastName, position);
    }
}
