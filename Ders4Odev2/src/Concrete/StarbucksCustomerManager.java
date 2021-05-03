package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;
public class StarbucksCustomerManager extends BaseCustomerManager {
//dolaylý yoldan save metodunu bu sýnýfa eklemiþ olduk.
	
	CustomerCheckService customerCheckService;
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
	super();
	this.customerCheckService = customerCheckService;
}
	@Override
	public void save(Customer customer) {
			if(this.customerCheckService.checkIfRealPerson(customer)) {	
				save(customer);
			}		
			else {
				System.out.println("Not a valid person");;
			}
			
		
		
	}
	

}
