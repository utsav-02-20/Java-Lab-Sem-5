import java.util.Scanner;
public class file1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        String name ; 
        System.out.println("Enter your Name : ");
        name = scanner.nextLine() ; 

        int unit ; 
        System.out.println("Enter number of Units");
        unit = scanner.nextInt() ; 

        double rate_per_unit ; 
        System.out.println("Enter number of Rate per Unit");
        rate_per_unit = scanner.nextDouble() ; 

        double fixed_service_charge ; 
        System.out.println("Enter number of Fixed Service Charges");
        fixed_service_charge = scanner.nextDouble() ; 

        double energy_charges = unit * rate_per_unit ; 
        double subtotal = energy_charges + fixed_service_charge ; 

        double total = subtotal + 5 * (subtotal / 100) ; 
        System.out.println("Total Bill amount : " + total);
    }
}