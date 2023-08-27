
package chapter4round;

import java.util.Scanner;


public class Chapter4round {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
//        charecter upper and lower case ber kora

        char ch = sc.next().charAt(0);
        
        if(ch >= 'A' && ch<='Z')
              {
                  System.out.println("Uppaer Case");
              }
        
        else {
               System.out.println("Lower Case");
              }  
    }   
}
