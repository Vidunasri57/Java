//Divide two integer values vs two double values and compare the results

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two integer values to be divided: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        sc.close();

        System.out.println("\n--Division of two integers:--");
        int div1 = num1 / num2;
        System.out.println("Value: " + div1);

        System.out.println("Enter two double values to be divided: ");
        double num_1 = sc.nextDouble();
        double num_2 = sc.nextDouble();

        System.out.println("\n--Division of two double values: ");
        double div2 = num_1 / num_2;
        System.out.println("Value: " + div2);

        if (Math.abs(div1 - div2)<0.0001){
            System.out.println("\nThe values are equal!!");
        }
    }
}
