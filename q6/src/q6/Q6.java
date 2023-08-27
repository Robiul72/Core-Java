
package q6;

import java.util.Arrays;

public class Q6 {

    public static void main(String[] args) {
        
         int[][] myArray = {{6, 1,0, 8}, {5, 0, 7, 4}, {2, 9, 10}};
         System.out.println("Array "+Arrays.deepToString(myArray));
         
        for (int rs = 0; rs < myArray.length; rs++) {
            for (int rc = 0; rc < myArray.length; rc++) {

                for (int r = 0; r < myArray.length; r++) {

                    for (int c = 0; c < myArray.length; c++) {
                        int temp;
                        if (myArray[rs][rc] > myArray[r][c]) { 
                            temp = myArray[r][c];
                            myArray[r][c] = myArray[rs][rc];
                            myArray[rs][rc] = temp;
                        }
                    }
                }

            }
        }
        System.out.println("New Descending number ");
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray.length; j++) {
                System.out.print(myArray[i][j] + " ");
            }
        }
        System.out.println("");
    }
    
}
