package Homework_6.employees;

abstract class Employee {
    private float baseSalary = 1000;
    private String organization = "Завод";

    public float getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(float baseSalary) {
        this.baseSalary = baseSalary;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    abstract void getPosition();
}
