package models;

import enums.Gender;
import enums.Position;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Staff {

    public Manager(String staffID, String name, int age, Gender gender, String address, String qualification, double salary, Position position) {
        super(staffID, name, age, gender, address, qualification, salary, Position.Manager);
    }
}
