package Homework_6.employees;

public class Accountant extends Employee {

    private String position = "Бухгалтер";
    private final float salary = getBaseSalary() + 500;


    @Override
    void getPosition() {
        System.out.printf("\nДолжность: %s", this.position);
    }

    public float getSalary() {
        return salary;
    }
}
