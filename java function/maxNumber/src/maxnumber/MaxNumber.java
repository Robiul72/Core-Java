
package maxnumber;

import java.util.Scanner;


public class MaxNumber {

 
    public static void main(String[] args) {
       
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Enter first number : ");
         int n1 =sc.nextInt();
         
        System.out.println("Enter secod number : ");
         int n2=sc.nextInt();
         
        System.out.println("Enter third number : ");
        int n3= sc.nextInt();
        
        if( n1>n2 && n1>n3){
            System.out.println("Max number is "+ n1);
        }
        else if (n2>n1 && n2>n3 ){
            System.out.println("Max number is " + n2);
        }
        
        else if (n3>n1 && n3>n2){
            System.out.println("Max number is " + n3);
        }
        
        
        if( n1<n2 && n1<n3){
            System.out.println("Min number is "+ n1);
        }
        else if (n2<n1 && n2<n3 ){
            System.out.println("Min number is " + n2);
        }
        
        else if (n3<n1 && n3<n2){
            System.out.println("Min number is " + n3);
        }
        
        else{
            System.out.println("not max number ");
        }  
        
        int sum = n1 + n2 + n3;
        
        System.out.println("Total "+n1+ " + "+n2+ " + "+n3+ " = "+ sum);
    }  
    
}
