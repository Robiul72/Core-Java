
package geo;

import java.util.Date;

public class Rectangle extends Geometric{
    
    private double hieght;
    private double wieght;

    public Rectangle() {
    }

    public Rectangle(double hieght, double wieght) {
        this.hieght = hieght;
        this.wieght = wieght;
    }

    public Rectangle(double hieght, double wieght, String color, boolean filled, Date date) {
        super(color, filled, date);
        this.hieght = hieght;
        this.wieght = wieght;
    }

    public double getHieght() {
        return hieght;
    }

    public void setHieght(double hieght) {
        this.hieght = hieght;
    }

    public double getWieght() {
        return wieght;
    }

    public void setWieght(double wieght) {
        this.wieght = wieght;
    }
    
    

    @Override
    public double getArea() {
        double area = hieght*wieght;
        return area;
    }

    @Override
    public double getaPeremiter() {
        double peremiter = 2*(hieght+wieght);
        return peremiter;
    }
    
}
