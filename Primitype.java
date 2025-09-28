// Declare one variable of each primitive type and print them

import java.util.Scanner;

public class Primitype {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // String
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        // int
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        // float
        System.out.print("Enter your height in cm: ");
        float height = sc.nextFloat();

        // double
        System.out.print("Enter your weight in kg: ");
        double weight = sc.nextDouble();

        // long
        System.out.print("Enter your phone number: ");
        long phone = sc.nextLong();

        // boolean
        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = sc.nextBoolean();

        // char
        System.out.print("Enter your grade (A/B/C): ");
        char grade = sc.next().charAt(0);

        // Display user profile
        System.out.println("\n--- User Profile ---");
        System.out.println("Name       : " + name);
        System.out.println("Age        : " + age);
        System.out.println("Height (cm): " + height);
        System.out.println("Weight (kg): " + weight);
        System.out.println("Phone No.  : " + phone);
        System.out.println("Student    : " + isStudent);
        System.out.println("Grade      : " + grade);

        sc.close();
    }
}

