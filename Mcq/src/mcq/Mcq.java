package mcq;

import java.util.Scanner;

public class Mcq {

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
//        System.out.println("Enter your name please ");
//        String name = input.next();

        StringBuilder name = new StringBuilder();

        name.append(" Robiul Islam ");

        System.out.println(name);

        System.out.println(name.reverse());

    }
}
