//Input true or false as boolean and print "you entered true" or "you entered false"

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter true or false: ");
        boolean val = sc.nextBoolean();

        sc.close();

        System.out.println("You entered " + val);
}
}
