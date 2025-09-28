//Widening cast: assign an int to a double and print both

import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a integer value: ");
        int num = sc.nextInt();

        sc.close();

        double num1 = num;
        System.out.println("The value of int is " + num + " and that value has been changed too " + num1);
        
    }
}
