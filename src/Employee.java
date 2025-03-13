/**
 * Abstract class with name, id, datehired attributes
 * Constructor will require all above attributes
 * Abstract method calculateSalary that does as the name says
 * Getters and setters for each attribute
 */
public abstract class Employee {
    // protected because the subclasses will be using them
    protected String name;
    protected String id;
    protected String date_hired;

    public Employee(String name, String id) {
        this.name = name;
        this.id = id;
    }


    abstract double calculateSalary();

    public String getName() {
        return this.name;
    }

    public String getId() {
        return this.id;
    }

    public String getDateHired() {
        return this.date_hired;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDateHired(String date_hired) {
        this.date_hired = date_hired;
    }
}
