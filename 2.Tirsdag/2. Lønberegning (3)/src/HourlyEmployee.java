public class HourlyEmployee extends Employee{

    private final int numberOfHours;
    private final int payPrHour;

    public HourlyEmployee(int numberOfHours, int payPrHour) {
        this.numberOfHours = numberOfHours;
        this.payPrHour = payPrHour;
    }

    @Override
    public int calculateSalary() {
        return numberOfHours * payPrHour;
    }
}
