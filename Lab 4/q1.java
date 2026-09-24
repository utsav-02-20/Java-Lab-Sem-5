// package Lab 4;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter project marks: ");
        double projectMarks = sc.nextDouble();

        System.out.print("Enter attendance percentage: ");
        double attendance = sc.nextDouble();

        System.out.print("Enter viva marks: ");
        double vivaMarks = sc.nextDouble();

        // Check approval conditions
        if (projectMarks >= 50 && attendance >= 75 && vivaMarks >= 40) {

            double finalScore = (0.6 * projectMarks) + (0.4 * vivaMarks);

            char grade;

            if (finalScore >= 80) {
                grade = 'A';
            } else if (finalScore >= 65) {
                grade = 'B';
            } else if (finalScore >= 50) {
                grade = 'C';
            } else {
                grade = 'D';
            }

            System.out.println("\nProject Status: Approved");
            System.out.println("Final Score: " + finalScore);
            System.out.println("Grade: " + grade);

        } else {

            System.out.println("\nProject Status: Rejected");

            if (projectMarks < 50) {
                System.out.println("Reason: Project marks below 50.");
            }

            if (attendance < 75) {
                System.out.println("Reason: Attendance below 75%.");
            }

            if (vivaMarks < 40) {
                System.out.println("Reason: Viva marks below 40.");
            }
        }

        sc.close();
    }
}