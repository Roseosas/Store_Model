package models;

public class Receipt {
    private String customerName;
    private String productName;
    private double price;

    public Receipt(String customerName, String productName,double price){
        this.customerName = customerName;
        this.productName = productName;
        this.price = price;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void printReceipt(){
        System.out.println("-----Receipt-----");
        System.out.println("Customer: " + customerName);
        System.out.println("Product: " + productName);
        System.out.println("Price: $"+ price);
        System.out.println("-----------------");
    }
}
