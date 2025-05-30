public class CommissionEmployee extends Employee{

    private final int baseSalary;
    private final int salesAmount;
    private final double commissionPercentage;

    public CommissionEmployee(int baseSalary, int salesAmount, double commissionPercentage) {
        this.commissionPercentage = commissionPercentage;
        this.baseSalary = baseSalary;
        this.salesAmount = salesAmount;
    }

    public int calculateSalary() {

        return (int) (baseSalary + (salesAmount * commissionPercentage));
    }
}
