package ragenumber;

import java.util.Scanner;

public class RageNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter item number");
        int rangNumber = input.nextInt();
        
        for (int i = 1; i <= rangNumber; i++) {

            if (i % 3 == 0 || i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}
