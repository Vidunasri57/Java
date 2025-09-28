//Take a string and an int (name & age) and print a short sentence

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        sc.close();

        System.out.println(name + " is " + age + " years old!");
    }
}
