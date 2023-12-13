
import models.Employee;

public class EmployeeProject {
    public static void main(String[] args) {
        Employee[] employees = new Employee[] {
                new Employee("John Doe", 50000),
                new Employee("Jane Smith", 55000),
                new Employee("Bob Johnson", 60000)
        };

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}

