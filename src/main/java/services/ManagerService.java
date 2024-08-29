package services;


import enums.Position;
import models.Staff;

public interface ManagerService {
    boolean hireCashier(Staff manager, Staff cashier);

    boolean fireCashier(Staff manager, Staff cashier);
}
