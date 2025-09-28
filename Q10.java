//Take a single character input and print it's ascii value

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        sc.close();

        System.out.println("Enter a Character to know  it's ASCII value: ");
        char a = sc.next().charAt(0);
        int val = (int) a;
        System.out.println("The ASCII value is found to be: " + val);

    }
}
