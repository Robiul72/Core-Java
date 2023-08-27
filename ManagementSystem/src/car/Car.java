
package car;

public class Car extends Vehicle{

    public Car() {
    }

    public Car(String registrationNumber, String brand, int year) {
        super(registrationNumber, brand, year);
    }

    @Override
    public void detaels() {
        super.detaels(); //To change body of generated methods, choose Tools | Templates.
    }
    
    

    @Override
    public void strat() {
        System.out.println("Car strat ");
    }

    @Override
    public void stop() {
        System.out.println("Car stop ");
    }
    
}
