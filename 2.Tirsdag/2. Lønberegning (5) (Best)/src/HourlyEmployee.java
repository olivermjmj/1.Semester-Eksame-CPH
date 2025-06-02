public class HourlyEmployee extends Employee{

    private double numberOfHours;
    private double payPrHour;

    public HourlyEmployee(double numberOfHours, double payPrHour) {
        this.numberOfHours = numberOfHours;
        this.payPrHour = payPrHour;
    }

    @Override
    public double calculateSalary() {
        return numberOfHours * payPrHour;
    }
}
