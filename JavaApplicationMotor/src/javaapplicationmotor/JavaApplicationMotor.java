
package javaapplicationmotor;

import val.Cycle;
import val.MotorCycle;
import val.Vehicle;

public class JavaApplicationMotor {

    public static void main(String[] args) {
       
        Vehicle cy = new Cycle("l-2010", "bm",2021);
        Vehicle mot = new MotorCycle("j-5120", "b", 2023);
        
        System.out.println("Regis no "+cy.getRegistrationNumber()+"\nBrand is "+cy.getBrand()+"\nYear is "+cy.getYear());
        System.out.println("");
        System.out.println("Regis no "+mot.getRegistrationNumber()+"\nBrand is "+mot.getBrand()+"\nYear is "+mot.getYear());
        
    }
    
}
