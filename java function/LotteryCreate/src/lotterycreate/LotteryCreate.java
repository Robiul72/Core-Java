
package lotterycreate;

import java.util.Scanner;


public class LotteryCreate {

  
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
//        lottary do while loop use
        
//        int guessNumber  = (int) (Math.random()* 10);
//        
//        int counter = 1;
//        
//        do{
//            System.out.println("Please enter your guess number ");
//            int userInput = input.nextInt();
//            if (guessNumber == userInput)
//               {
//                System.out.println("Hurray You win");
//                break;
//                }
//            else {
//                  System.out.println("Please try again ");
//                 }
//            counter ++;
//        }
//        while (counter <= 5);
//        System.out.println("Batter luck next time ");
//        System.out.println("The number is " + guessNumber);


        //      for loop use for lottery 
        
        int guessNumber = (int) (Math.random()*10);
        
        System.out.println("Please enter your guess number");
        
        for (int i = 1; i <= 5; i++)
        {
            int inputNumber = input.nextInt();
            
            if (inputNumber < 10);
            
            if(guessNumber == inputNumber)
                { 
                 System.out.println("You are win $1000 ");
                 break;
                }
                  if(i > 4)
                        {
                         System.out.println("Good Luck Next time again bro, Your ans is  " + guessNumber);
                        }
                    else  {
                            System.out.println("Please try again ");
                          }
        }
        
       
       
      
        
    }
    
}
