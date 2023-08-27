package robi.pkg6;

import java.util.Arrays;
import java.util.Scanner;

public class Robi6 {

    public static void main(String[] args) {

        int[][] my = {{65, 20, 55}, {20, 4, 41}, {30, 45, 10}};
        System.out.println("old Array " + Arrays.deepToString(my));
        for (int k = 0; k < my.length; k++) {

            for (int i = 0; i < my.length; i++) {
                for (int j = 0; j < my.length - 1; j++) {

                    if (my[i][j] < my[i][j + 1]) {
                        int temp = my[i][j + 1];
                        my[i][j + 1] = my[i][j];
                        my[i][j] = temp;
                    }
                }
            }
        }
        System.out.println(" ");
        System.out.println("Ascending Array " + Arrays.deepToString(my));
    }

}
