package Homework_6.employees;

public class EmployeesTask {
    public static void main(String[] args) {
        Employee director = new Director();
        Employee worker = new Worker();
        Employee accountant = new Accountant();

        Employee[] employees = {director, worker, accountant};


        for (Employee employee : employees) {
            employee.getPosition();
        }

    }
}
