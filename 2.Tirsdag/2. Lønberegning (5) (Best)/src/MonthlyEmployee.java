import java.math.BigDecimal;

public class MonthlyEmployee extends Employee{

    private double income;

    public MonthlyEmployee(double income) {
        this.income = income;
    }

    @Override
    public double calculateSalary() {
        return this.income;
    }
}
