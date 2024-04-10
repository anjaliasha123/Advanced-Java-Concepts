import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new LinkedList<>();
        employees.add(new Employee("John Doe", 1200d));
        employees.add(new Employee("Jane Doe", 5000d));
        employees.add(new Employee("Skillet Johns", 500000d));
        EmployeeInterface interfaceObj1 = new EmployeeInterface() {

            @Override
            public double findHighestSalary(List<Employee> employees) {
                double highest = 0d;
                for(Employee emp: employees){
                    if(emp == null) continue;
                    highest = Math.max(highest, emp.getSalary());
                }
                return highest;
            }
        };
        System.out.print("Implementation of Interface using anonymous class: ");
        interfaceObj1.display();
        EmployeeInterface interfaceObj2 = emp -> emp
                .stream()
                .filter(Objects::nonNull)
                .mapToDouble(Employee::getSalary)
                .max()
                .orElse(0);
        System.out.println("Implementation of Interface using lambda expression: "+interfaceObj2.getClass());
    }

}