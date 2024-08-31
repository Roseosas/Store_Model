import models.Staff;
import services.ManagerService;
import services.implementation.ManagerServiceImplementation;

import static enums.Gender.Female;
import static enums.Gender.Male;
import static enums.Position.Cashier;
import static enums.Position.Manager;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ManagerServiceImplementationTest {
    public void testHireCashier(){
        Staff manager = new Staff("S006", "AIYANYOR ROSEMARY OSAS", 25, Female, "ABUJA", "MASTERS", 5000000, Manager, 100);
        Staff cashier= new Staff("S002", "OSAGIE HAPPINESS",21, Female, "ABUJA NIGERIA", "OLEVEL", 25000, Cashier,11);
        Staff cashier2 = new Staff("S002", "MERCY TANA",25, Female, "ABUJA NIGERIA", "OLEVEL", 25000, Cashier,11);
        ManagerService service= new ManagerServiceImplementation();
        assertTrue(service.hireCashier(manager,cashier));
        assertFalse(service.hireCashier(manager,cashier2));

    }

    public void testFireCashier(){
        Staff manager = new Staff("S007", "JOEL EMMAMOKE", 25, Male, "ABUJA NIGERIA", "OLEVEL", 25000, Cashier, 2);
        Staff cashier3= new Staff("S008", "OSAGIE HAPPINESS",21, Female, "ABUJA NIGERIA", "OLEVEL", 25000, Cashier,1);
        ManagerService service =  new ManagerServiceImplementation();

        service.fireCashier(manager,cashier3);
        assertTrue(service.fireCashier(manager, cashier3));

    }
}
