package services;

import models.Customers;
import models.Products;
import models.Staff;

public interface CashierService {
    boolean sellProduct(Staff cashier, Products products);

    void dispenseReceipt(Customers customers, Products products);
}
