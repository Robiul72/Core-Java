package seriesnumber;

import java.util.Scanner;

public class SeriesNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter item number");
        int n = input.nextInt();

        int n1 = 0;
        int n2 = 1;
        int sum = 0;

        System.out.println(n1 + "\n" + n2);

        for (int i = 3; i <= n; i++) {
            sum = n1 + n2;

            System.out.println(sum);

            n1 = n2;
            n2 = sum;
        }

    }
}
