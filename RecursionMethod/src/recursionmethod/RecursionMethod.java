package recursionmethod;
import java.util.Scanner;
public class RecursionMethod {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number ");
        int number = input.nextInt();

        int result = factorial(number);
        System.out.println("Factorial number is = " + result);
    }
    
    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
