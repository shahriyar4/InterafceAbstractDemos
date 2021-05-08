package Abstract;

import Entities.Customer;

public class CustomerChechManager implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		
		return true;
	}

}
