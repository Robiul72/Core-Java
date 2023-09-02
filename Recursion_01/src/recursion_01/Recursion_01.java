
package recursion_01;

import java.util.Scanner;

public class Recursion_01 {

    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number ");
        int nu = input.nextInt();
        int result = sum(nu);
        System.out.println("Factorial number "+result);
        
    }
    public static int  sum(int n){
    
    if(n == 1){
    return 1;
        
    }
    else{
    
        return n*sum(n-1);
    }
        
    }
    
}
