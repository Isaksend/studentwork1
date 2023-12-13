package models;

public class Employee {
    private int id;
    private String name;
    private double salary;

    private static int counter = 0;

    public Employee(String name, double salary) {
        this.id = ++counter;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee ID: " + id + ", Name: " + name + ", Salary: " + salary;
    }
}
