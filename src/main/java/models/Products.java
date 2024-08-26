package models;


public class Products {
    private String items;
    private double unitPrice;
    private int quantity;

    public Products(){

    }

    public Products(String items, double unitPrice, int quanity) {
        this.items = items;
        this.unitPrice = unitPrice;
        this.quantity= quantity;
    }

    public String getItems() {
        return items;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setItems(String items) {
        this.items = items;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
