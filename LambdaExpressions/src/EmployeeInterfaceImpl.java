import java.util.List;

public class EmployeeInterfaceImpl implements EmployeeInterface{
    @Override
    public double findHighestSalary(List<Employee> employees) {
        double highest = 0d;
        for(Employee emp: employees){
            if(emp == null) continue;
            highest = Math.max(highest, emp.getSalary());
        }
        return highest;
    }
    
}
