public class CommissionEmployee extends Employee{

    private double baseSalary;
    private double salesAmount;
    private double commissionPercentage;

    public CommissionEmployee(double baseSalary, double salesAmount, double commissionPercentage) {
        this.baseSalary = baseSalary;
        this.salesAmount = salesAmount;
        this.commissionPercentage = commissionPercentage;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + (salesAmount * commissionPercentage); //fx 0.80 for 80% commissionPercentage
    }
}
