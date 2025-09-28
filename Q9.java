import java.util.Scanner;

public class Q9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an interger value: ");
        int n1 = sc.nextInt();

        System.out.println("Enter a double value: ");
        double n2 = sc.nextDouble();

        sc.close();

        double mul = n1 * n2;
        int mult = (int) mul;

        System.out.println("The Multiplication value in double is: " + mul);
        System.out.println("The Multiplication value in interger is: " + mult);
    }
}
