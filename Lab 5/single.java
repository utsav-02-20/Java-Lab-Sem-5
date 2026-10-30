class Person {
    String name;
    int age;

    void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    int rollNumber;
    double marks;

    void displayStudent() {
        displayPerson();
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
    }
}

public class single {
    public static void main(String[] args) {
        Student s = new Student();

        s.name = "Rahul";
        s.age = 20;
        s.rollNumber = 101;
        s.marks = 85.5;

        s.displayStudent();
    }
}
