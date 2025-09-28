//Add two float numbers and print the result

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st float number: ");
        float num1 = sc.nextFloat();

        System.out.println("Enter 2nd float number: ");
        float num2 = sc.nextFloat();

        sc.close();

        System.out.println("\n---Addition of two float values---");
        float sum = num1 + num2;
        System.out.println("Sum of float numbers: " + sum);
    }
}
