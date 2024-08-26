package services;



import models.Cashier;

public interface ManagerService {
    void hireCashier(Cashier cashier);

    void fireCashier(Cashier cashier);
}
