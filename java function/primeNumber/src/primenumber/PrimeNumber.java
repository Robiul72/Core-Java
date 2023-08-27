
package primenumber;

import java.util.Scanner;


public class PrimeNumber {


    public static void main(String[] args){
       
        Scanner input = new Scanner (System.in);
        
        System.out.println("Enter number ");
        int userNumber = input.nextInt();
        
        int count = 0;
        
        for( int i = 1; i<= userNumber; i++)
        {
            if(userNumber % i == 0) 
            {
              count += 1;
            }
        }
//        end for loop
          if (count == 2)
           {
            System.out.println("This is a Prime Number");
           }
          else 
             {
              System.out.println("This is a not Prime Number");
             }
    }    
}
