package facterialnumber;

import java.util.Scanner;

public class FacterialNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number ");
        int number = input.nextInt();

        int sum = 1;

        for (int i = 1; i < number + 1; i++) {   // for (int i = 1; i < number +1; i++)
            sum *= i;
        }
 
        {
            System.out.println("This is a Factirial Number " + sum);
        }
    }
}
