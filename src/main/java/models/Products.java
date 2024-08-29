package models;


public class Products {
    private String productName;
    private double unitPrice;
    private int quantity;
    private int stock;

    public Products(){

    }

    public Products(String items, double unitPrice, int quanity, int stock) {
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.quantity= quantity;
        this.stock=stock;
    }

    public String getProductName() {
        return productName;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setProductName(String items) {
        this.productName = productName;
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

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    public void reduceStock(int quantity){
        if (quantity <= stock){
            stock -= quantity;
        }
    }
}
