package twodarray;

import array.TwoDimentionalArray;
import java.util.Scanner;

public class TwoDArray {

    public static void main(String[] args) {
       
        
        Scanner input = new Scanner (System.in);
         
        System.out.println("Enter your row number ");
        int row =input.nextInt();
        
        System.out.println("Enter your col number ");
        int col =input.nextInt();
        
         TwoDimentionalArray robiul = new TwoDimentionalArray();
        
           int [][]newArray = robiul.creatArray(row, col);
           
           int sumOfArray = robiul.doSum(newArray);
           
           System.out.println(sumOfArray);

//        int[][] numbers = {{1, 2, 3, 4,}, {5, 6, 7, 8}};
//        int[][] marks = new int[5][3];
//
//        for (int row = 0; row < marks.length; row++) {
//            for (int col = 0; col < marks[row].length; col++) {
//                marks[row][col] = (int) (Math.random() * 100);
//            }
//        }
//        System.out.println("Number is " + robiul.doSum(numbers));
//        System.out.println("Mark is " + robiul.doSum(marks));




    }
}
