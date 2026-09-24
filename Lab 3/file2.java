import java.util.Scanner;

public class file2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        String name ; 
        System.out.println("Enter your Name");
        name = sc.nextLine() ; 

        int[] subs = new int[5]  ; 
        int total = 0 ; 
        for(int i = 0 ; i < 5 ; i++) {
            System.out.println("Enter Marks for Subject " + (i + 1));
            subs[i] = sc.nextInt(); 
            total += subs[i] ; 
        }
        double percent = (double)total * (100 / 100) ; 
        float average_marks = total / 5 ; 
        int average_marks_int = (int) average_marks ; 
        System.out.println("Total marks obtained is : " + total + "\nPercentage is : " + percent + "\nAverage Marks is (float) : " + average_marks + "\nAverage Marks is (int) : " + average_marks_int);
    } 
}
