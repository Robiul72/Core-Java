
package binaryiorandom;

import java.util.Arrays;
import java.util.Scanner;

public class BinaryIorandom {

    public static void main(String[] args) {
       
        Scanner input= new Scanner (System.in);
        
        int [] myArray = new int[100];
        
        for(int i=0; i<myArray.length; i++){
        
            myArray[i]= (int)(Math.random()*100);}
            System.out.println("Enter a index number "+Arrays.toString(myArray));
            int number = input.nextInt();
            
            try{
                int num = myArray[number];
                System.out.println(num);
                
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }
        
    }
    
}
