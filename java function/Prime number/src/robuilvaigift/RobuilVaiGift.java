
package robuilvaigift;

import java.util.Scanner;


public class RobuilVaiGift {

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int number=sc.nextInt();
        int i=1;
        int sum=0;
        
       for(i=1;i<=number;i++)
            {
                if(number%i==0)
                    {
                        sum+=1;              
                    }
            
           }
           if(sum==2){
                        System.out.println(" prime ");
                     }
            else{
                   System.out.println("not prime");
                }
       }
    }
    

