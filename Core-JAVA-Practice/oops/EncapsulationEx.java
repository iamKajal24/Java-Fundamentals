public class EncapsulationEx {

    public static void main(String[] args) {

        BankAccount ba = new BankAccount();
        ba.deposit(1000);
        ba.withdrawl(500);

        System.out.println(ba.getBalance());

        Employee e1 = new Employee(101, "Kajal", "IT");

        System.out.println(e1.getEmployeeName());
        System.out.println(e1.getDepartment());
        e1.setEmployeeName("Kajal pandit");
        System.out.println(e1.getEmployeeName());
        System.out.println(e1.getEmployeeId());

    }

}

class BankAccount {
    private double balance;

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdrawl(double amount) {
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}

class Employee {
    private int employeeId;
    private String employeeName;
    private String department;

    public Employee(int employeeId, String employeeName, String department) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.department = department;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

}
