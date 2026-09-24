import java.util.Scanner ; 
public class file3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        System.out.println("Enter The amount in US Doller $ ");
        int USD ; 
        USD = sc.nextInt() ; 

        float inr = (float)(USD * 95.75) ; 
        int inr_round = (int) inr ; 

        int get = inr_round - 2 * (inr_round / 100) ; 
        float get_float = inr - 2 * (inr / 100) ; 

        System.out.println("Us Doller " + USD + " in INR is : " + inr + "\nIn Round off INR is " + inr_round);
        System.out.println("Amount left after Conversion Charges : " + get_float + "\n Round off is : " + get);

    }
}
