package array_random;

import java.util.Arrays;

public class Array_random {

    public static void main(String[] args) {

        int[] marks = new int[15];

        for (int i = 0; i < marks.length; i++) { // for loop
            marks[i] = (int) (Math.random() * 15);
        }

        for (int mark : marks) { //  Foreach Loops 

            System.out.println(mark);
        }

    }

}
