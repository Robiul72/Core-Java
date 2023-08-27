
package car;


public class Motor extends Vehicle{

    public Motor() {
    }

    public Motor(String registrationNumber, String brand, int year) {
        super(registrationNumber, brand, year);
    }

    @Override
    public void detaels() {
        super.detaels(); //To change body of generated methods, choose Tools | Templates.
    }
    
    

    @Override
    public void strat() {
        System.out.println("MOtorCycle start ");
    }

    @Override
    public void stop() {
        System.out.println("MotorCycle stop ");
    }
    
}
