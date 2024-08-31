import models.Products;
import models.Staff;
import services.CashierService;
import services.implementation.CashierServiceImplementation;

import static enums.Gender.Male;
import static enums.Position.Cashier;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CashierServiceImplementationTest {
    public  void TestSellProduct(){
    Staff cashier= new Staff("S001", "HOPE EGHOSA", 25, Male, "LAGOS", "OND", 50000, Cashier, 20);
    Products products = new Products("Rice", 2000.00, 50, 100);
    CashierService service = new CashierServiceImplementation();

    assertTrue(service.sellProduct(cashier,products));
    assertEquals(50, products.getStock());

}
}
