package models;

import enums.Gender;
import enums.Position;

public class Cashier  extends Staff{
    public Cashier(String staffID, String name, int age, Gender gender, String address, String qualification, double salary, Position position){
        super(staffID,name,age, gender, address, qualification, salary,Position.Cashier);
    }

    public void add(Cashier cashier) {
    }

    public void remove(Cashier cashier) {
    }
}
