public class CommissionEmployee extends Employee {

    private final int baseSalary;
    private final int salesAmount;
    private final double commissionPercentage;

    public CommissionEmployee(int baseSalary, int salesAmount, double commissionPercentage) {
        this.baseSalary = baseSalary;
        this.salesAmount = salesAmount;
        this.commissionPercentage = commissionPercentage;
    }

    @Override
    public int calculateSalary() {
        return (int) (this.baseSalary + (this.salesAmount * this.commissionPercentage));
    }
}
