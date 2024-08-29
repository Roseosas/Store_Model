package services.implementation;

import enums.Position;
import models.Customers;
import models.Products;
import models.Receipt;
import models.Staff;
import services.CashierService;

public class CashierServiceImplementation implements CashierService {
    public boolean sellProduct(Staff cashier, Products products) {
        if (cashier.getPosition() != Position.Cashier){
            products.setQuantity(products.getQuantity()-1);
            System.out.println("Only a Cashier can process purchases.");
            return false;
        }
        if(products.getStock() < products.getQuantity()){
            System.out.println("Cannot complete purchase: "+ products.getProductName()+ " is out of stock or not enough quantity.");
            return false;
        }
        double totalAmount= products.getUnitPrice() * products.getQuantity();
        products.reduceStock(products.getQuantity());
        System.out.println("Purchase complete: "+ products.getQuantity() + "x"+ products.getProductName()+ " for $"+ totalAmount);
        return true;
    }
    public void dispenseReceipt(Customers customers, Products products){
        Receipt receipt = new Receipt(customers.getName(), products.getProductName(), products.getUnitPrice());
        receipt.printReceipt();
    }

}

