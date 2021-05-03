package Concrete;

import Abstract.BaseCustomerManager;
import Entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager {
//dolaylı yoldan save metodunu bu sınıfa eklemiş olduk.
	
	@Override
	public void save(Customer customer) {
		System.out.println("Saved to database : "+customer.getFirstName());
		
	}
	

}
