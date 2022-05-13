package Homework_10;

import Homework_10.employee.Director;
import Homework_10.employee.Employee;

import java.util.stream.Collectors;

public final class OpredelyatorService {

    private static OpredelyatorService instance;

    public static OpredelyatorService getInstance() {
        if (instance == null) {
            instance = new OpredelyatorService();
        }
        return instance;
    }

    public boolean determinePresenceEmployeeWithNameInDirectorSubordinateStructure(Director director, String employeeName) {
        boolean match = director.getSubordinateEmployees()
                .stream()
                .anyMatch(employee -> employee.getFirstName().equals(employeeName));
        if (!match) {
            for (Employee subordinateDirector : director.getSubordinateEmployees().stream()
                    .filter(employee -> employee.getPosition().equals(Position.DIRECTOR))
                    .collect(Collectors.toSet())) {
                if (determinePresenceEmployeeWithNameInDirectorSubordinateStructure((Director) subordinateDirector, employeeName)) {
                    match = true;
                    break;
                }
            }
        }
        return match;
    }
}
