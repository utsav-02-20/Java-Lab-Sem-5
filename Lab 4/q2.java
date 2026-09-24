// package Lab 4;
import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter age: ");
        int age = sc.nextInt();

        sc.nextLine(); // consume newline

        System.out.print("Enter day: ");
        String day = sc.nextLine();

        System.out.print("Enter number of tickets: ");
        int tickets = sc.nextInt();

        double ticketPrice = 200;
        double baseAmount = ticketPrice * tickets;
        double weekendAmount = baseAmount;
        double ageDiscountAmount;
        double finalAmount;

        // Weekend charge
        if (day.equalsIgnoreCase("Saturday") || day.equalsIgnoreCase("Sunday")) {
            weekendAmount = baseAmount + (baseAmount * 0.25);
        }

        // Age discount
        ageDiscountAmount = weekendAmount;
        if (age < 25) {
            ageDiscountAmount = weekendAmount - (weekendAmount * 0.20);
        } else if (age >= 60) {
            ageDiscountAmount = weekendAmount - (weekendAmount * 0.30);
        }

        // Group discount
        finalAmount = ageDiscountAmount;
        if (tickets >= 5) {
            finalAmount = ageDiscountAmount - (ageDiscountAmount * 0.10);
        }

        // Output
        System.out.printf("\nBase Amount: %.2f ₹\n", baseAmount);
        System.out.printf("After Weekend Charge: %.2f ₹\n", weekendAmount);
        System.out.printf("After Age Discount: %.2f ₹\n", ageDiscountAmount);
        System.out.printf("After Group Discount: %.2f ₹\n", finalAmount);
        System.out.printf("Final Amount: %.2f ₹\n", finalAmount);

        sc.close();
    }
}