class Employee {
    double calculateSalary() {
        return 0;
    }
}

class PermanentEmployee extends Employee {
    double calculateSalary() {
        return 50000;
    }
}

class ContractEmployee extends Employee {
    double calculateSalary() {
        return 30000;
    }
}

class PartTimeEmployee extends Employee {
    double calculateSalary() {
        return 15000;
    }
}

public class RuntimePolymorphism {
    public static void main(String[] args) {
        Employee e;

        e = new PermanentEmployee();
        System.out.println("Permanent Employee Salary: " +
                e.calculateSalary());

        e = new ContractEmployee();
        System.out.println("Contract Employee Salary: " +
                e.calculateSalary());

        e = new PartTimeEmployee();
        System.out.println("Part-Time Employee Salary: " +
                e.calculateSalary());
    }
}