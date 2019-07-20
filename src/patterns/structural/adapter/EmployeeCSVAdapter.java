package patterns.structural.adapter;

public class EmployeeCSVAdapter implements Employee {

    private EmployeeCSV employeeCSV;

    public EmployeeCSVAdapter(EmployeeCSV employeeCSV) {
        this.employeeCSV = employeeCSV;
    }

    @Override
    public String getId() {
        return String.valueOf(employeeCSV.getId());
    }

    @Override
    public String getFirstName() {
        return employeeCSV.getFirstname();
    }

    @Override
    public String getLastName() {
        return employeeCSV.getLastname();
    }

    @Override
    public String getEmail() {
        return employeeCSV.getEmailAddress();
    }
}
