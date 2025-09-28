//Cast an int to char and print the character

import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a integer : ");
        int value = sc.nextInt();

        sc.close();

        char charac = (char) value;

        System.out.println("The character for the value " + value + " is " + charac);

    }
}
