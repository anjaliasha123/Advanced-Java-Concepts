import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new LinkedList<>();
        employees.add(new Employee("John Doe", 1200d));
        employees.add(new Employee("Jane Doe", 5000d));
        employees.add(new Employee("Skillet Johns", 500000d));
        EmployeeInterface interfaceObj = employees1 -> employees1.stream()
                    .filter(Objects::nonNull)
                    .mapToDouble(Employee::getSalary)
                    .max()
                    .orElse(0);


        System.out.println(interfaceObj.findHighestSalary(employees));
    }
}