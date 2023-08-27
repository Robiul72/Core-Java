
package managerment;

import vel.Car;
import vel.Motor;
import vel.Vehicle;

public class Managerment {

    public static void main(String[] args) {
        Vehicle car = new Car("k-2015", "BmW",2019);
        Vehicle mot = new Motor("k-2000", "BW",2021);
        
        car.details();
        car.start();
        car.stop();
        System.out.println("");
        mot.details();
        mot.start();
        mot.stop();
    }
    
}
