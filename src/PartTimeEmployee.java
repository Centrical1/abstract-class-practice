/**
 * Attributes: hourly_rate, hours_worked
 * Methods: calculateSalary
 */
public class PartTimeEmployee extends Employee {
    private double hourly_rate;
    private double hours_worked;

    public PartTimeEmployee(String name, String id) {
        super(name, id);
    }

    public double getHourlyRate() {
        return this.hourly_rate;
    }

    public double getHoursWorked() {
        return this.hours_worked;
    }

    public void setHourlyRate(double hourly_rate) {
        this.hourly_rate = hourly_rate;
    }

    public void setHoursWorked(double hours_worked) {
        this.hours_worked = hours_worked;
    }

    @Override
    public double calculateSalary() {
        return hourly_rate * hours_worked;
    }

}
