package lesson13;

import java.util.Collection;

public class Question {
    public static void main(String[] args) {
        EmployeeUtils employeeUtils = new EmployeeUtils();

        Collection<Employee> employees = employeeUtils.fillEmployees(100);

        employeeUtils.printAllEmployees(employees);

        System.out.println("=====");

        employeeUtils.printEmployees(employees, 10);

        System.out.println("=====");
        System.out.println("Удаляем каждого нечетного сотрудника с конца");

        employeeUtils.deleteOddFromEnd(employees);

        employeeUtils.printAllEmployees(employees);

    }
}
