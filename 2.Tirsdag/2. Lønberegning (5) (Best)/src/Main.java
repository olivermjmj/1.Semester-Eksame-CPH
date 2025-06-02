import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Employee> employees= new ArrayList<>();
        employees.add(new MonthlyEmployee(50_000.69));
        employees.add(new HourlyEmployee(8, 240.420));
        employees.add(new CommissionEmployee(20_000.11, 10_000, 0.80)); //Commission fee of 80

        for(Employee employee : employees) {
            System.out.println("Earns: " + employee.calculateSalary() + "kr.");
        }
    }
}