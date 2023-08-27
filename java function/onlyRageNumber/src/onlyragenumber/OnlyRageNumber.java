package onlyragenumber;

import java.util.Scanner;

public class OnlyRageNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter start number");
        int start = input.nextInt();

        System.out.println("Enter end number ");
        int end = input.nextInt();

        System.out.println("Prime number is ");

        for (int i = start; i <= end; i++) {

            int count = 0;

            for (int j = 1; j <= i; j++) {
                
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(i);
            }
        }

    }

}
