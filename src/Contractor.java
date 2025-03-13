/**
 * Attributes: contract_rate, projects_completed
 * Methods: calculateSalary - based on number of projects completed by contract rate
 */
public class Contractor extends Employee {
    private double contract_rate;
    private double projects_completed;

    public Contractor(String name, String id) {
        super(name, id);
    }

    public double getContractRate() { return this.contract_rate; }
    public double getProjectsCompleted() { return this.projects_completed; }

    public void setContractRate(double contract_rate) { this.contract_rate = contract_rate; }
    public void setProjectsCompleted(double projects_completed) { this.projects_completed = projects_completed; }

    @Override
    public double calculateSalary() {
        return contract_rate * projects_completed;
    }

}
