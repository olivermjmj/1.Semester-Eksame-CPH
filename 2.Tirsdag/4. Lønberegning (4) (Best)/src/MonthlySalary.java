public class MonthlySalary extends Employee{

    private final int salary;

    public MonthlySalary(int salary) {
        this.salary = salary;
    }


    @Override
    public int calculateSalary() {
        return this.salary;
    }
}
