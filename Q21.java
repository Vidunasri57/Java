//Add an int and a double and show type promotion

import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an interger value: ");
        int val1 = sc.nextInt();

        System.out.println("Enter a double value: ");
        double val2 = sc.nextDouble();

        sc.close();

        double sum = val1 + val2;

        System.out.println("The sum of " + val1 + " and " + val2 + " is " + sum);
    }
}
