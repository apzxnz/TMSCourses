package Homework_6.employees;

public class Worker extends Employee {

    private String position = "Рабочий";
    private final float salary = (float) (getBaseSalary() + 0.000001);


    @Override
    void getPosition() {
        System.out.printf("\nДолжность: %s", this.position);
    }


    public float getSalary() {
        return salary;
    }
}
