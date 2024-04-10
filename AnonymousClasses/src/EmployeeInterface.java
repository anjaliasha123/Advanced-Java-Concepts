import java.util.List;

@FunctionalInterface
interface EmployeeInterface {
    public double findHighestSalary(List<Employee> employees);
    default void display(){
        System.out.println(this.getClass());
    }
}
