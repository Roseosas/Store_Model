package services.implementation;

import models.Products;
import services.CustomerService;

public class CustomerServiceImplementation implements CustomerService {
    @Override
    public String buyProduct(Products products) {
        if (products.getQuantity()>0){
            products.setQuantity(products.getQuantity()-1);
            System.out.println("Bought "+ products.getItems());
        }else {
            System.out.println(products.getItems()+ " is out of stock.");
        }

        return "null";
    }
}
