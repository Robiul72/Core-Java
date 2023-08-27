package arraybinary;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayBinary {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers = new int[100];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100);
           
        }
         System.out.println(Arrays.toString(numbers));
            System.out.println("Enter a Index number ");
            int indexNumber = input.nextInt();
            
            try{
            
                int  num =numbers [indexNumber];
                System.out.println("Index number si "+num+ " Located  no is  "+ indexNumber);
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }

    }

}
