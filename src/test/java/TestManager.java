import enums.Gender;
import enums.Position;
import services.implementation.ManagerServiceImplementation;


import static enums.Gender.Female;

public class TestManager {
    void testHireCashier(){
        Manager manager= new Manager("S005", "AIYANYOR ROSEMARY OSAS", 26, Gender.Female, "LAGOS","MASTERS", 20000000.00, Position.Manager);
        Cashier cashier= new Cashier("S001", "OSAGIE HAPPINESS",21, Female, "ABUJA NIGERIA", "OLEVEL", 25000, Position.Cashier);
        ManagerServiceImplementation.hireCashier(cashier);
        assert(ManagerServiceImplementation.getCashiers().contains(cashier));
    }
}
