import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new MonthlyEmployee(50_000));
        employees.add(new HourlyEmployee(8, 120));
        employees.add(new CommissionEmployee(20_000, 10000, 0.20));

        for(Employee employee : employees) {
            System.out.println(employee.calculateSalary());
        }
    }
}