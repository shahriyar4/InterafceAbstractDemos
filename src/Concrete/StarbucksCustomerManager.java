package Concrete;

import Abstract.CustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

	private CustomerCheckService customerCheckService;

	public StarbucksCustomerManager() {

		this.customerCheckService = customerCheckService;

	}

	@Override
	public void save(Customer customer) {

		if (customerCheckService.checkIfRealPerson(customer)) {
			super.save(customer);
		} else {

			System.out.println("Wrong acces");
		}

	}

}
