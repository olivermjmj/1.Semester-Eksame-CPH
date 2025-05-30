import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new MonthlySalary(50_000));
        employees.add(new HourlyEmployee(8, 200));
        employees.add(new CommissionEmployee(20_000,10_000,0.80));

        for(Employee employee : employees) {

            System.out.println(employee.calculateSalary());
        }
    }
}