package question.number.pkg02;

import java.util.Scanner;

public class QuestionNumber02 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a Factorial number ");
        int n = input.nextInt();

        int result = 1;
        for (int i = n; i >= 1; i--) {
            result = result * i;
        }
        System.out.println("Factorial number is " + result);
    }

}
