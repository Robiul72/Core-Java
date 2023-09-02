package recursion_method;

import java.util.Scanner;

public class Recursion_Method {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a index number");
        int number = input.nextInt();
        
        int result=fibonacci(number);
        System.out.println("Fibonacci series is "+result);
        
        
    }
 
    public static int fibonacci(int index){
    if(index==0){
    return 0;
    }
    else if (index==1){
    return 1;
    }
    else{
    return fibonacci(index-1)+fibonacci(index-2);
    }
    }
    
}
