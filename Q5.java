//Take a string input and print "hello <name>""

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        sc.close();

        System.out.println("Hello " + name + "!!");
    }
}
