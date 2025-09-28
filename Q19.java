//Cast a char to int and print ascii value

import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char charac = sc.next().charAt(0);

        sc.close();

        int value = charac;

        System.out.println("The ASCII value is " + value);

    }
}
