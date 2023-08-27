
package vel;

public abstract class Vehicle {
    
    private String registraNumber;
    private String brand;
    private int year;

    public Vehicle() {
    }

    public Vehicle(String registraNumber, String brand, int year) {
        this.registraNumber = registraNumber;
        this.brand = brand;
        this.year = year;
    }

    public String getRegistraNumber() {
        return registraNumber;
    }

    public void setRegistraNumber(String registraNumber) {
        this.registraNumber = registraNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    public abstract void start();
    
    public abstract void stop();
    
    public void details(){
    
        System.out.println("Registration Number is "+ registraNumber+ " Brand is " + brand + " Year is "+year);
    
    }
}
