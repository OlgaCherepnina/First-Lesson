package lesson13;

import java.util.*;

public class EmployeeUtils {
    public Collection<Employee> fillEmployees(int size) {
        Collection<Employee> employees = new ArrayList<>(size);
        //Collection<Employee> employees = new LinkedList<>();

        for (int i = 0; i < size; i++) {
            employees.add(generateRandomEmployee());
        }

        return employees;
    }

    public void printAllEmployees(Collection<Employee> employees) {
        System.out.println("Печать всех сотрудников");

        Iterator<Employee> employeeIterator = employees.iterator();

        while (employeeIterator.hasNext()) {
            System.out.println(employeeIterator.next().toString());
        }
    }

    public void printEmployees(Collection<Employee> employees, int workAge) {
        System.out.println(String.format("Печать сотрудников, чей стаж равен %d лет", workAge));

        Iterator<Employee> employeeIterator = employees.iterator();

        while (employeeIterator.hasNext()) {
            Employee currentEmployee = employeeIterator.next();

            if (currentEmployee.getWorkAge() == workAge) {
                System.out.println(currentEmployee.toString());
            }
        }
    }

    public void deleteOddFromEnd(Collection<Employee> employees) {
        List<Employee> employeeToDelete = new ArrayList<>(employees);
        ListIterator<Employee> employeeListIterator = employeeToDelete.listIterator(employees.size());

        boolean odd = true;
        while (employeeListIterator.hasPrevious()) {
            employeeListIterator.previous();

            if (odd) {
                employeeListIterator.remove();
            }

            odd = !odd;
        }

        employees = employeeToDelete;
    }

    private Employee generateRandomEmployee() {
        // Случайная генерация Ф.И.О.
        char lastLetter = (char) (new Random().nextInt(26) + 'a');
        char nameLetter = (char) (new Random().nextInt(26) + 'a');
        char patronymicLetter = (char) (new Random().nextInt(26) + 'a');

        String name = (lastLetter + ". " + nameLetter + ". " + patronymicLetter + ".").toUpperCase();
        Integer personnelNumber = new Random().nextInt(10000);
        Integer workAge = new Random().nextInt(40);

        return new Employee(name, personnelNumber, workAge);
    }
}
