package Abstract;
import Entities.Customer;

public abstract class BaseCustomerManager implements CustomerService {

	@Override
	public abstract void save(Customer customer);
	
}


