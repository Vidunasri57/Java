//Take three doubles as input an print their average

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three double values to find their average: ");
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();

        sc.close();

        double avg = (n1 + n2 + n3)/3;

        System.out.println("The average value is " + avg);
    }
}
