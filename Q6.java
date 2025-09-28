//Take two integers as input and print their sum

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Two integers to be added: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        sc.close();

        int sum = num1 + num2;

        System.out.println("The sum value is: " + sum);
    }
}
