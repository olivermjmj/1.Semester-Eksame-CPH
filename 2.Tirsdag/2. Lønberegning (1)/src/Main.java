import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Employee> employeeList = new ArrayList<>();

        employeeList.add(new MonthlyEmployee(50_000));
        employeeList.add(new HourlyEmployee(7, 120));
        employeeList.add(new CommissionEmployee(20_000, 10_000, 0.20));

        for(Employee employee : employeeList) {

            System.out.println(employee.calculateSalary() + "kr.");
        }
    }
}