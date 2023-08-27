package val;

public class MotorCycle extends Vehicle {

    public MotorCycle() {
    }

    public MotorCycle(String registrationNumber, String brand, int year) {
        super(registrationNumber, brand, year);
    }

    @Override
    public void details() {
        super.details();
    }

    @Override
    public void strat() {
        System.out.println("MotorCycle is Start ");
    }

    @Override
    public void stop() {
        System.out.println("MotorCycle is Stop ");
    }

}
