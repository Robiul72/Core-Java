
package managementsystem;

import car.Car;
import car.Motor;
import car.Vehicle;


public class ManagementSystem {

    public static void main(String[] args) {
      
        Vehicle car = new Car("k-2021","BMW", 2012);
        Vehicle mot = new Motor("H-2015", "Honda",2022);
        
        car.detaels();
        car.strat();
        car.stop();
        System.out.println("");
        mot.detaels();
        mot.strat();
        mot.stop();
       
    }
    
}
