package people;

public class Employee extends People{
    private int employeeId;
    private String companyName;

    public Employee(String firstName, String lastName, int employeeId, String companyName) {
        super(firstName, lastName);
        this.employeeId = employeeId;
        this.companyName = companyName;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    @Override
    public String toString() {
        return ("Employee: " + getFullName() + " whith employee id: " + employeeId + " works for company: " + companyName);
    }
}
