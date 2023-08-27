package question_number_01;

import java.util.Scanner;

public class Question_number_01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;
        while (true) {
            System.out.println("Enter a number ");
            int n = input.nextInt();
            if (n == -1) {
                break;
            }
            sum += n;
        }
        System.out.println("Total number is " + sum);
    }

}
