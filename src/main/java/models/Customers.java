package models;

import enums.Gender;

public class Customers extends Staff {

    public Customers(String name, String address, Gender gender){
        super(name, gender, address);
    }

}
