
package calculate;

public class Sub_Price {
    
    private double quantity;
    private double unitPrice;

    public Sub_Price() {
    }

    public Sub_Price(double quantity, double unitPrice) {
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
    
    public double totalPrice(){
    double totalPrice = quantity*unitPrice;
    
    return totalPrice;
    
    }
    
    
}
