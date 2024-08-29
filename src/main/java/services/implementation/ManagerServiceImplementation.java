package services.implementation;


import enums.Position;
import models.Staff;
import services.ManagerService;

import java.util.List;

public class ManagerServiceImplementation implements ManagerService{
    private static List<Staff> staffList;
    public boolean hireCashier(Staff manager, Staff cashier) {
       if (manager.getPosition() != Position.Manager){
           System.out.println("Only a Manager can hire a cashier." );
           return false;
       }
        if (cashier.getPosition() != Position.Cashier|| cashier.getAge()<=20) {
            System.out.println("Cannot hire cashier" + cashier.getAge()+ ": Must be above 20 years old.");
            return false;
        }
        staffList.add(cashier);
        System.out.println("Cashier "+ cashier.getName() + "has been hired by Manager "+ manager.getName()+".");
        return true;
    }
    public boolean fireCashier(Staff manager, Staff cashier){
        if (manager.getPosition() != Position.Manager){
            System.out.println("You are not a manager.");
            return false;
        }
        if (cashier.getPerformingRating() <3){
            staffList.remove(cashier);
            System.out.println("Cashier "+ cashier.getName()+ "has been fired due to poor performance.");
            return true;
        }else {
            System.out.println("Cashier"+ cashier.getName()+ " has a good performance record and cannot be fired.");
            return  false;
        }
    }
}