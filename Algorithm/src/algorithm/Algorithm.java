package algorithm;

import java.util.Scanner;

public class Algorithm {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a milli second ");

        long number = input.nextInt();

        long result = getTime(number);

        System.out.println(result);

    }

    public static long getTime(long n) {

        long startTime = System.currentTimeMillis();
        long k = 0;
        for (int i = 1; i < n; i++) {
            k = k + 5;
        }

        long endTime = System.currentTimeMillis();
        {
            System.out.println("Execution time for n = " + n + " is " + (endTime - startTime) + " milliseconds");

        }
        return 1;
    }
}
