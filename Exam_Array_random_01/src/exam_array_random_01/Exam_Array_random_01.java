
package exam_array_random_01;

import java.util.Arrays;
import java.util.Scanner;

public class Exam_Array_random_01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int [] myArrays = new int [100];
        
        for (int i=0; i<myArrays.length; i++){
            myArrays[i] = (int) (Math.random()*100);
                       
        }
        System.out.println("Array numbers "+ Arrays.toString(myArrays));
        System.out.println("Enter a Index number Please ");
            int number = input.nextInt();
             System.out.println("Index number is "+number);
             
            try{
            int num = myArrays[number];
            
              System.out.println("Array number is " +num);
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }
    }
    
}
