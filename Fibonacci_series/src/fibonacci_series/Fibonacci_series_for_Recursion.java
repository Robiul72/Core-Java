package fibonacci_series;

import java.util.Scanner;

public class Fibonacci_series_for_Recursion {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a number ");
        int number = input.nextInt();
        
        int result = fib(number);
        System.out.println("Index value is "+result);
    }
    
    
    
    

    public static int fib(int index) {
        if (index == 0) {
            return 0;
        } else if (index == 1) {
            return 1;
        } else {
//            System.out.println(fib(index - 1) + fib(index - 2));

            return fib(index - 1) + fib(index - 2);  // jdi index 2 hoy index -1 = 1, index -2 = 0
        }
    }
}
