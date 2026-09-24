// 1. Write a Java program to print the results of the following operations. 
// a. -5 + 8 * 6 
// b. (55+9) % 9 
// c. 20 + -3*5 / 8 
// d. 5 + 15 / 3 * 2 – 8 % 3  
// 2. Write a Program to Swap Two Numbers  
// 3. Write a Java Program to convert Integer numbers and Binary numbers. 
// 4. Write a Program to Find Factorial of a Number in Java. 
// 5. Write a Program to Calculate Simple Interest in Java.

public class lab2 {
    public static void main(String[] args) {
        
        int val1 = -5 + 8 * 6 ; 
        System.out.println(val1);

        int val2 = (55 + 9) % 9 ; 
        System.out.println(val2);

        int val3 = 20 + (-3 * 5 / 8); 
        System.out.println(val3);

        int val4 = 5 + 15 / 3 * 2 - 8 % 3  ; 
        System.out.println(val4);

        // swap 
        int a = 5 , b = 7 ; 
        System.out.println(a + " " + b);
        // temp val 
        int temp = a ; 
        a = b ; 
        b = temp ; 
        System.out.println(a + " " + b);

        // number to binary 
        int num = 11;
        String binary_num = Integer.toBinaryString(num) ;
        System.out.println(num + " to " + binary_num);

        // factorial 
        int n = 5 ; 
        int ans1 = 1 ;
        for(int i = 1 ; i <= n ; i++) {
            ans1 *= i ; 
        }
        System.out.println("factorial of " + n + " is " + ans1);

        // simple interest 
        int pri = 1000 ; 
        double rate = 6.3 ; 
        double time = 5.5 ; 
        double si = (pri * rate * time) / 100 ; 
        System.out.println(si);
    }
}