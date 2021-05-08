import java.time.LocalDate;

import Concrete.BaseCustomerManager;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {

		BaseCustomerManager customerManager = new StarbucksCustomerManager();

		customerManager.save(new Customer(1, "Shahriyar", "Hesenov", LocalDate.of(2003, 1, 20), "11111111111"));
		
		System.out.println();
	}

}
