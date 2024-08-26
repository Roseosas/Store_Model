package services.implementation;

import models.Customers;
import models.Products;
import models.Receipt;
import services.CashierService;

public class CashierServiceImplementation implements CashierService {
    public String sellProductToCustomer(Customers customers, Products products) {
        if (products.getQuantity()> 0){
            products.setQuantity(products.getQuantity()-1);
            System.out.println("Sold "+ products.getItems() + " to " + customers.getName());
            giveCustomerReceipt(customers, products);
        }else {
            System.out.println(products.getItems()+ " is out of stock.");
        }
        return null;
    }
    public String giveCustomerReceipt(Customers customers, Products products){
        Receipt receipt = new Receipt(customers.getName(), products.getItems(), products.getUnitPrice());
        receipt.printReceipt();
        return null;
    }

    public void performDuties(){
        System.out.println("Handling sales and assisting customers.");
    }


}

