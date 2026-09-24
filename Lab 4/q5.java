// package Lab 4;
import java.util.Scanner;

class CanteenOrder {
    String studentName;
    String itemName;
    int quantity;
    double pricePerItem;

    // Calculate total amount
    double calculateTotal() {
        return quantity * pricePerItem;
    }

    // Calculate discount amount
    double calculateDiscount() {
        double total = calculateTotal();

        if (total > 1000) {
            return total * 0.10; // 10% discount
        } else if (total > 500) {
            return total * 0.05; // 5% discount
        } else {
            return 0;
        }
    }

    // Display bill
    void displayBill() {
        double total = calculateTotal();
        double discount = calculateDiscount();
        double finalAmount = total - discount;

        System.out.println("\n----- Canteen Bill -----");
        System.out.println("Student Name: " + studentName);
        System.out.println("Item: " + itemName);
        System.out.println("Quantity: " + quantity);
        System.out.printf("Price per Item: %.2f ₹\n", pricePerItem);
        System.out.printf("Total Amount: %.2f ₹\n", total);

        if (total > 1000) {
            System.out.println("Discount: 10%");
        } else if (total > 500) {
            System.out.println("Discount: 5%");
        } else {
            System.out.println("Discount: 0%");
        }

        System.out.printf("Discount Amount: %.2f ₹\n", discount);
        System.out.printf("Final Amount: %.2f ₹\n", finalAmount);
    }
}

public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CanteenOrder order = new CanteenOrder();

        // Input
        System.out.print("Enter student name: ");
        order.studentName = sc.nextLine();

        System.out.print("Enter item name: ");
        order.itemName = sc.nextLine();

        System.out.print("Enter quantity: ");
        order.quantity = sc.nextInt();

        System.out.print("Enter price per item: ");
        order.pricePerItem = sc.nextDouble();

        // Display bill
        order.displayBill();

        sc.close();
    }
}