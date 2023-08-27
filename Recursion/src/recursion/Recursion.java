package recursion;

import java.util.Scanner;

public class Recursion {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Factorial number ");
        int number = input.nextInt();

        long result = factorial(number);

        System.out.println("Fictorial number is " + result);

//       long nu = factorial(5);  
//        System.out.println(nu);
    }

    public static long factorial(int n) {

        if (n > 0) {
            return n * factorial(n - 1);  // 5*(5-1)= 20, 20*(5-2)=60,  60*(5-3)=120, 120*(5-4)= 120
        } 
        else {
            return 1;
        }
    }
}
