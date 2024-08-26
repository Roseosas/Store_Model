package services.implementation;


import models.Cashier;
import services.ManagerService;
import services.EmployeeAction;

import java.util.List;

public class ManagerServiceImplementation implements ManagerService{
    private List<Cashier> cashiers;
    @Override
    public void hireCashier(Cashier cashier) {
        cashier.add(cashier);
        System.out.println(cashier.getName()+ " has been hired.");
    }


    @Override
    public void fireCashier(Cashier cashier) {
        cashier.remove(cashier);
        System.out.println(cashier.getName()+ " has been fired.");
    }
    public void performDuties(){
        System.out.println("Managing the store and overseeing operations.");
    }
    public List<Cashier> getCashiers(){
        return cashiers;
    }
}