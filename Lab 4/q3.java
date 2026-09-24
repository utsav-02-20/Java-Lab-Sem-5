// package Lab 4;
import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] days = {
            "Monday", "Tuesday", "Wednesday",
            "Thursday", "Friday", "Saturday", "Sunday"
        };

        double[] expense = new double[7];
        double total = 0;
        double highest = 0;
        String highestDay = "";

        // Input expenses
        for (int i = 0; i < 7; i++) {
            System.out.print("Enter expense for " + days[i] + ": ");
            expense[i] = sc.nextDouble();

            total += expense[i];

            if (i == 0 || expense[i] > highest) {
                highest = expense[i];
                highestDay = days[i];
            }
        }

        // Calculate average
        double average = total / 7;

        // Count days above average
        int aboveAverageDays = 0;
        for (int i = 0; i < 7; i++) {
            if (expense[i] > average) {
                aboveAverageDays++;
            }
        }

        // Output
        System.out.printf("\nTotal Weekly Expense: %.2f ₹\n", total);
        System.out.printf("Average Daily Expense: %.2f ₹\n", average);
        System.out.printf("Highest Expense: %.2f ₹\n", highest);
        System.out.println("Highest Expense Day: " + highestDay);
        System.out.println("Days Spending Above Average: " + aboveAverageDays);

        sc.close();
    }
}