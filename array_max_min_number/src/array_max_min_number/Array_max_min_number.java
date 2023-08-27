package array_max_min_number;

import java.util.Scanner;

public class Array_max_min_number {

    public static void main(String[] args) {

        Scanner nu = new Scanner(System.in);

        System.out.println("Enter your Array number ");
        int n = nu.nextInt();

        int max = 0;
        int min = 9999999;
        int total = 0;

        int[] numbers = new int[n]; // array create 

        for (int i = 0; i < numbers.length; i++) { // for loop
            
            numbers[i] = (int) (Math.random() * 100); // random create 

            total += numbers[i]; // total create 

            if (max < numbers[i]) { // max  number create 
                max = numbers[i];
            }
            else if (min > numbers[i]) { // min number create 
                min = numbers[i];
            }

        }

        for (int mark : numbers) { //  Foreach Loops read 

            System.out.print(mark + " ");
        }
        System.out.println("\nTotal number is " + total);
        System.out.println("Max number is " + max);
        System.out.println("Min number is " + min);

    }

}
