//Print the result of (int)(7.9) + (double)(5)

public class Q22 {
    public static void main(String[] args) {
    
    double sum = (int) 7.9 + (double) 5; //7 got type promoted
    System.out.println("The sum is " + sum);
    }
}
