package Abstract;

import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublic;

public interface CustomerCheckService {
	 boolean checkIfRealPerson(Customer customer);
	 
	
}
