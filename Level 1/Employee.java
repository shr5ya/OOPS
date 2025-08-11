public class Employee {
    String name;
    String id;
    double salary;

    public Employee(String name, String id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Employee Name: " + this.name);
        System.out.println("Employee ID: " + this.id);
        System.out.printf("Employee Salary: $%,.2f\n", this.salary);
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee("Alice Smith", "EMP001", 60000);
        employee1.displayDetails();
    }
}