public class MainEmployee {
    public static void main(String[] args) {
        Manager m = new Manager(111, "HR", 60000, "Team Lead");
        m.displayEmployee();
        m.setSalary(75000);
        System.out.println("Updated Salary: " + m.getSalary());
    }
}

class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}

class Manager extends Employee {
    String role;

    public Manager(int employeeID, String department, double salary, String role) {
        super(employeeID, department, salary);
        this.role = role;
    }

    public void displayEmployee() {
        System.out.println("Employee ID: " + employeeID +
                           ", Department: " + department +
                           ", Salary: " + getSalary() +
                           ", Role: " + role);
    }
}
