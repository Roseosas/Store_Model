package services;

import models.Customers;
import models.Products;

public interface CashierService {
    String sellProductToCustomer(Customers customers, Products products);

    String giveCustomerReceipt(Customers customers, Products products);
}
