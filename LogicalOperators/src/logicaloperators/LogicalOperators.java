
package logicaloperators;

import java.util.Scanner;


public class LogicalOperators {

  
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in); //dynamic korte hole scanner create korte hobe
        
//        and condition

        int number=input.nextInt(); // ekhane input korte hobe
        
        if (number % 3 == 0  && number % 2 == 0){
            
            System.out.println("Hello");
        
        }
        else {
            System.out.println("Bye");
        }
//        
        
//          Exclosive or fucntion
//
//        int number1=input.nextInt();
//        
//        if (number1 % 3 == 0  ^ number1 % 2 == 0){
//            
//            System.out.println("Hello");
//        
//        }
//        else {
//            System.out.println("Bye");
//        }
        
        
    }
    
}
