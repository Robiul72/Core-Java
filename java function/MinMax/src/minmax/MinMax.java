
package minmax;

import java.util.Scanner;

public class MinMax {


    public static void main(String[] args) {
        
        Scanner imput = new Scanner (System.in);
        
        System.out.println("Enter item number ");
        int n = imput.nextInt();
        
        int max = 0;
        int min = 9999999;
        
        int inputNumber = 0;
        
        while (n >0)
        {
            System.out.println("Enter number ");
            inputNumber= imput.nextInt();
            
            if (max < inputNumber)
             {
                max = inputNumber;
             }
            
                if (min > inputNumber)
                {
                    min = inputNumber;
                }
            n --;
        }
        int sum= max + min;
        
        System.out.println("Max number = "+ max);
        System.out.println("Min number = "+ min);
        System.out.println("Max "+max+ " + "+min+ " = "+ sum);
        
    }
    
}
