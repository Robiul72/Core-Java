
package robiu;

import robiu.GeometricObject;
import java.util.Date;

public class CircleClass extends GeometricObject{
    
    private double radius;

    public CircleClass() {
    }

    public CircleClass(double radius) {
        this.radius = radius;
    }

    public CircleClass(double radius, String color, boolean filled, Date date) {
        super(color, filled, date);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    

    @Override
    public double getArea() {
        double area=Math.PI*radius*radius;
        return area;
    }

    @Override
    public double getPeremiter() {
        double peremiter = 2*Math.PI*radius;
        return peremiter;
    }
    
    
}
