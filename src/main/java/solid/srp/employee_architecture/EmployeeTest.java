package solid.srp.employee_architecture;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee(1, "Udo", "development", true);
        ClientModel.hireNewEmployee(employee);
        ClientModel.printEmployeeReport(employee, FormatType.XML);
        ClientModel.printEmployeeReport(employee, FormatType.CSV);
    }
}