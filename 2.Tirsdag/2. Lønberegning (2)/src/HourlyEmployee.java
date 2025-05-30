public class HourlyEmployee extends Employee{

    private final int numberOfHours;
    private final int payPrHour;

    public HourlyEmployee(int numberOfHours, int payPrHour) {
        this.payPrHour = payPrHour;
        this.numberOfHours = numberOfHours;
    }

    @Override
    public int calculateSalary() {
        return payPrHour * numberOfHours;
    }
}
