package fibonaccinumber;

import fibonacci.GetNumber;
import java.util.Scanner;

public class FibonacciNumber {

    public static void main(String[] args) {

        GetNumber call = new GetNumber();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your number");
        int n = input.nextInt();

        call.callNumber(n);
    }

}
