class Person {
    String name;
    int age;

    void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Employee extends Person {
    int employeeId;

    void displayEmployee() {
        displayPerson();
        System.out.println("Employee ID: " + employeeId);
    }
}

class Developer extends Employee {
    String language;

    void displayDeveloper() {
        displayEmployee();
        System.out.println("Programming Language: " + language);
    }
}

public class multilevel {
    public static void main(String[] args) {
        Developer d = new Developer();

        d.name = "Amit";
        d.age = 25;
        d.employeeId = 501;
        d.language = "Java";

        d.displayDeveloper();
    }
}