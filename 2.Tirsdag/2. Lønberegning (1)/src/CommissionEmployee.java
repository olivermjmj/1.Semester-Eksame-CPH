public class CommissionEmployee extends Employee{

    private final int baseSalary;
    private final int salesAmount;
    private final double commissionPercentage; //fx 0.20

    public CommissionEmployee(int baseSalary, int salesAmount, double commissionPercentage) {
        this.baseSalary = baseSalary;
        this.commissionPercentage = commissionPercentage;
        this.salesAmount = salesAmount;
    }


    @Override
    public int calculateSalary() {
        return (int) (baseSalary + (salesAmount * commissionPercentage));
    }
}