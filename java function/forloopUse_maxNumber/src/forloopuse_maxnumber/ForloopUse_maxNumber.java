
package forloopuse_maxnumber;

import java.util.Scanner;

public class ForloopUse_maxNumber {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
         System.out.println("Enter item number ");
        int n = sc.nextInt();
        
        int max=0;
        int min = 999999;
        int sum = 0;
        
        for(int i= 1; i<=n; i++)
        {
            System.out.println("Pls enter number" +i);
            int number = sc.nextInt();
            
            sum += number;
            
            if (max < number)
              {
                max = number;
              }
            
             else if ( min > number)
                {
                 min = number;
                }
        }
        
        System.out.println(" Max number is "+max);
        System.out.println(" Min number is "+min);
        System.out.println(" There are Total number is = "+sum);
             
    }
    
}
