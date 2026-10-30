interface Academic {
    double calculateAcademic();
}

interface Sports {
    double calculateSports();
}

interface StudentPerformance extends Academic, Sports {
    void displayPerformance();
}

class Student implements StudentPerformance {
    double marks = 85;
    double sportsMarks = 90;

    public double calculateAcademic() {
        return marks;
    }

    public double calculateSports() {
        return sportsMarks;
    }

    public void displayPerformance() {
        double overall =
                (calculateAcademic() + calculateSports()) / 2;

        System.out.println("Academic Performance: " +
                calculateAcademic());

        System.out.println("Sports Performance: " +
                calculateSports());

        System.out.println("Overall Performance: " + overall);
    }
}

public class InterfaceInheritance {
    public static void main(String[] args) {
        Student s = new Student();
        s.displayPerformance();
    }
}