
package com.mycompany.recursion_02;

import java.util.Scanner;

public class Recursion_02 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter a number ");
        
        int number = input.nextInt();
        
        long result =factorial(number);
        
        System.out.println("Fictorial number is " +result);
    }
    
    public static long factorial(int n){

        if(n > 0){
        return n * factorial(n - 1);
        }

        else{
        return 1;
        }
    }
}
