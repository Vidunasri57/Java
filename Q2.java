// Show the difference between int and long using a large number

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("Enter your phone number: ");
        long ph_num = sc.nextLong();
        sc.close();


        System.out.println("\n---Difference---");
        System.out.println("Age of the client: " + age);
        System.out.println("Phone number of the client: " +ph_num);
    }
    
}
