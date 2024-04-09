import java.util.List;

public class ImperitiveCode {
    public double findHighestSalary(List<Employee> employees){
        double highest = 0d;
        for(Employee emp: employees){
            if(emp == null) continue;
            highest = Math.max(highest, emp.getSalary());
        }
        return highest;
    }
}
