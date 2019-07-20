package patterns.structural.adapter;

public class EmployeeLdapAdapter implements Employee {

    private final EmployeeLdap employeeLdap;

    public EmployeeLdapAdapter(EmployeeLdap employeeLdap) {
        this.employeeLdap = employeeLdap;
    }

    public Employee asEmployee(EmployeeLdap employeeLdap) {
        return new EmployeeDB(employeeLdap.getCn(), employeeLdap.getGivenName(), employeeLdap.getSurname(),
                employeeLdap.getMail());
    }


    @Override
    public String getId() {
        return employeeLdap.getCn();
    }

    @Override
    public String getFirstName() {
        return employeeLdap.getGivenName();
    }

    @Override
    public String getLastName() {
        return employeeLdap.getSurname();
    }

    @Override
    public String getEmail() {
        return employeeLdap.getMail();
    }
}
