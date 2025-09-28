//Narrowing cast: convert a double to an int and print both

import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a double value: ");
        double num = sc.nextDouble();

        sc.close();

        int num1 = (int) num;
        System.out.println("The value of double is " + num + " and that value has been changed to " + num1);
        
    }
}
