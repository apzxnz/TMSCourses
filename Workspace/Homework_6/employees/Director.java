package Homework_6.employees;

public class Director extends Employee {

    private String position = "Директор";
    private final float salary = getBaseSalary() + 9999999;


    @Override
    void getPosition() {
        System.out.printf("\nДолжность: %s", this.position);
    }

    public float getSalary() {
        return salary;
    }
}
