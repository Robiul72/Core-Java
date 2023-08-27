package mainproject;

import java.util.Scanner;
import math.DoMath;

public class MainProject {
    
    public static void main(String[] args) {
        
        DoMath in = new DoMath();
        Scanner input = new Scanner(System.in);
        
        System.out.println("enter number");
        int n1 = input.nextInt();
        
        System.out.println(in.primeNumber(n1));
    }
    
}
