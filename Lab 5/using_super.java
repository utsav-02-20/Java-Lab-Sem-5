class Employee {
    String name;
    int employeeId;
    double salary;

    Employee(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    String department;

    Manager(String name, int employeeId,
            double salary, String department) {

        super(name, employeeId, salary);
        this.department = department;
    }

    void displayManager() {
        display();
        System.out.println("Department: " + department);
    }
}

public class using_super {
    public static void main(String[] args) {
        Manager m = new Manager(
                "Ravi", 101, 50000, "IT");

        m.displayManager();
    }
}