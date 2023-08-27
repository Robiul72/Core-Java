package multidimentionalarray;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimentionalArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter row number ");
        int row = input.nextInt();

        System.out.println("enter column number ");
        int column = input.nextInt();

        int sum = 0;
        
         int max = 0;
        int min = 9999999;

        int[][] matrixArray = new int[row][column]; // [row][column]

//        matrixArray[0][0]=10;  10 15 20 first row
//        matrixArray[0][1]=15;
//        matrixArray[0][2]=20;
//        
//        matrixArray[1][0]=25;  25 30 35 second row
//        matrixArray[1][1]=30;
//        matrixArray[1][2]=35;
//        
//        matrixArray[2][0]=40;  40 45 50 third row
//        matrixArray[2][1]=45;
//        matrixArray[2][2]=50;
//        System.out.println(Arrays.deepToString(matrixArray));
        for (int i = 0; i < row; i++) {
            int total = 0;
            for (int j = 0; j < column; j++) {
              
                matrixArray[i][j] = (int) (Math.random() * 100);

                total += matrixArray[i][j];
                
                sum +=matrixArray[i][j];
                
                if(max <matrixArray[i][j]){
                max = matrixArray[i][j];
                }
                else if(min >matrixArray[i][j]){
                min = matrixArray[i][j];
                }
                
                System.out.print(matrixArray[i][j] + " ");
            }
            System.out.println("\ntotal row number is " + total);
            
            System.out.println("");
        }
        System.out.println("Total number is " + sum);
        System.out.println("Max number is "+ max);
        System.out.println("Min number is "+min);
    }
}
