package array_random_01;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Random_01 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Total Array Size ");
        int number = input.nextInt();

        int[] myArrays = new int[number];
        for (int i = 0; i < myArrays.length; i++) {
            myArrays[i] = (int) (Math.random() * number);
        }
        System.out.println(Arrays.toString(myArrays));

        int num = input.nextInt();
        System.out.println("Please Indext number " + num);
        try {
            int numb = myArrays[num];
            System.out.println("Array Value number is " + numb);
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }

}
