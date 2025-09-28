//print a formatted string using system.out.printf (eg, %.2f)

import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name: ");
        String name = sc.nextLine();

        System.out.println("Enter age: ");
        int age = sc.nextInt();

        System.out.println("Enter number: ");
        double gpa = sc.nextDouble();

        sc.close();

        System.out.printf(" %s is of age %d and their gpa is %.2f", name, age, gpa);
    }
}
