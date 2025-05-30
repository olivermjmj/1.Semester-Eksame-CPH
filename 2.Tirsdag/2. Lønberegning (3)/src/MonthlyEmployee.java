public class MonthlyEmployee extends Employee{

    private final int salary;

    public MonthlyEmployee(int salary) {
        this.salary = salary;
    }


    @Override
    public int calculateSalary() {
        return this.salary;
    }
}
