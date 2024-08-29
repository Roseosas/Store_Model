package models;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static enums.Gender.Female;
import static enums.Gender.Male;
import static enums.Position.Cashier;

public class Main {
    public Main(){

    }
    public static void main(String[] args) throws IOException {
        List<Products> newListOfProducts = new ArrayList<>();
        newListOfProducts.add(new Products("Rice", 2000.00, 50, 20));
        newListOfProducts.add(new Products("Beans",2000.00, 10, 20));
        newListOfProducts.add(new Products("Milk", 100.00, 20, 5));
        newListOfProducts.add(new Products("Cereal",200.00, 10, 10));
        newListOfProducts.add(new Products("Noodles", 10000.00, 5, 14));
        newListOfProducts.add(new Products("Sugar", 100.00, 6, 26));
        List<Staff> newListOfStaff = new ArrayList<>();
        newListOfStaff.add(new Staff("S001", "HOPE EGHOSA", 25, Male, "LAGOS", "OND", 50000, Cashier, 20));
        newListOfStaff.add(new Staff("S002", "OSAGIE HAPPINESS",21, Female, "ABUJA NIGERIA", "OLEVEL", 25000, Cashier,11));

        List<Customers> newLisOfCustomers = new ArrayList<>();
        newLisOfCustomers.add(new Customers("WISDOM DANIEL", "EDO", Male));
        newLisOfCustomers.add(new Customers("OLESON DEBORAH", "ENUGU", Female));
        newLisOfCustomers.add(new Customers("DAVID EMMANUEL", "ABUJA", Male));

    }
}
