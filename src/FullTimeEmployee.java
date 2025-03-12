/**
 * Subclass of employee that describes full time employees
 * Has additional annual_salary attribute
 * Overridden calculateSalary method that uses annual_salary attribute
 * Getters and setters for annual_salary
 */
public class FullTimeEmployee extends Employee {
    private double annual_salary;

    public FullTimeEmployee(String name, String id) {
        super(name, id);
    }

    public double getAnnualSalary() {
        return this.annual_salary;
    }

    public void setAnnualSalary(double annual_salary) {
        this.annual_salary = annual_salary;
    }

    // Calculates monthly salary
    @Override
    public double calculateSalary () {
        double salary;
        salary = this.annual_salary / 12;
        return salary;
    }
}
