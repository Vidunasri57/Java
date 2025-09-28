//Input radius of a circle (double) and print area

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius of circle: ");
        double radius = sc.nextDouble();

        sc.close();

        double area = Math.PI * radius * radius;

        System.out.println("The Area of the circle is " + area );
}
}