package Concrete;

import Abstract.BaseCustomerManager;
import Entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager {
//dolayl� yoldan save metodunu bu s�n�fa eklemi� olduk.
	
	@Override
	public void save(Customer customer) {
		System.out.println("Saved to database : "+customer.getFirstName());
		
	}
	

}
