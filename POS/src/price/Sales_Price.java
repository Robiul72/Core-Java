
package price;

public class Sales_Price {
    private double quantity;
    private double unitPrice;

    public Sales_Price() {
    }

    public Sales_Price(double quantity, double unitPrice) {
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
