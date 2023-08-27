
package com.mycompany.fibonacci_for_recursion;

import java.util.Scanner;

public class Fibonacci_For_Recursion {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter a number ");
        int number = input.nextInt();
        
        long result = fibonacci(number);
        System.out.println("Index value is "+result);
         
    }
    
    public static long fibonacci(int n){
    
        if(n==0){
        return 0;
        }
        else if (n==1){
        return 1;
        }
        else{
        return fibonacci(n-1)+fibonacci(n-2);
           
        }
    }
}
