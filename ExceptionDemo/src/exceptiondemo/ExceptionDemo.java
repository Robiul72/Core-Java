package exceptiondemo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        boolean continueInput = true;  // boolean true theke niya hoyeche
        do {
            try {           // try and catch use and create 
                System.out.println("Enter a integer ");
                 float number = input.nextFloat();
                 
                System.out.println("The number entered is " + number);
                
                continueInput = false; // boolean true theke niya hoyeche
            }
                catch (InputMismatchException robi)
                {  //  float or int etc number theke input korte hobe
                
                    System.out.println("Try again.(" + "Incorrect input: an integer is required )");
                    input.nextLine();
                }
        }
            while (continueInput);  // boolean true theke niya hoyeche sout er moto

        }
        
    }
