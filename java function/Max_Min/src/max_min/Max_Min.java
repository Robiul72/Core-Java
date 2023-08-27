
package max_min;

import java.util.Scanner;


public class Max_Min {


    public static void main(String[] args) {
       
        Scanner sc = new Scanner (System.in);
        
        System.out.println("enter 1st number");
        int n1 = sc.nextInt();
        
        System.out.println("enter 2nd number");
         int n2 = sc.nextInt();
         
        System.out.println("enter 3rd number");
         int n3 = sc.nextInt();
        
         int max = 0, min = 0;
         
         // max number
         
         if(n1>n2 && n1>n3)
         {
            int maxNumber = n1;
         }
         
         else if (n2>n1 && n2>n3)
         {
             int maxNumber = n2;
         }
         else {
           int  maxNumber = n3;
         }
         
         // min number
         
         if(n1<n2 && n1<n3)
         {
            int minNumber = n1;
         }
         
         else if (n2<n1 && n2<n3)
         {
             int minNumber = n2;
         }
         else {
           int  minNumber = n3;
         }
         
         System.out.println("Max number = "+ n1);
         System.out.println("Min number = "+ n3);
    }
    
}
