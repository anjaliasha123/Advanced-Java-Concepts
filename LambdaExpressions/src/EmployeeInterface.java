import java.util.List;
@FunctionalInterface
interface EmployeeInterface {
    public double findHighestSalary(List<Employee> employees);
    static void sayHi(){
        System.out.println("Hi");
    }
    default void display(){
        System.out.println("inside employee interface");
    }
}
