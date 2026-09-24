import java.util.Scanner;

public class file4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name;
        System.out.println("Enter your Name");
        name = sc.nextLine();

        String emp_id;
        System.out.println("Enter your (6 Digit) Employee ID ");
        emp_id = sc.next();
        if (emp_id.length() != 6) {
            System.out.println("Invalid Employee id");
            return;
        }

        double salary;
        System.out.println("Enter the Basic Salary");
        salary = sc.nextDouble();

        int days;
        System.out.println("Enter the number of Working Days");
        days = sc.nextInt();

        int ot_hr;
        System.out.println("Enter The OverTime Hours");
        ot_hr = sc.nextInt();

        double ot_rate_ph;
        System.out.println("Enter the OverTime pay (per hour) : ");
        ot_rate_ph = sc.nextDouble();

        float hra = (float) (20 * (salary / 100));
        float da = (float) (15 * (salary / 100));
        int ot_pay = (int) (ot_hr * ot_rate_ph);
        float gross_salary = (float) (salary + hra + da + (float) ot_pay);
        float tax = (float) (10 * (gross_salary / 100));
        float net_salary = gross_salary - tax;

        System.out.println("Salary       : " + salary);
        System.out.println("HRA          : " + hra);
        System.out.println("DA           : " + da);
        System.out.println("OT Pay       : " + ot_pay);
        System.out.println("Gross Salary : " + gross_salary);
        System.out.println("Tax          : " + tax);
        System.out.println("Net Salary   : " + net_salary);
    }
}
