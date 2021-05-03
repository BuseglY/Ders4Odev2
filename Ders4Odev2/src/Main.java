import Adapters.*;
import java.time.LocalDate;
import Abstract.*;
import Concrete.*;
import Entities.*;
public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager=new StarbucksCustomerManager(new MernisServiceAdapter());
		Customer customer=new Customer(1,"Engin","Demiroð",LocalDate.of(1985,01,06),"28861499108");
		customerManager.save(customer);
		
	}

}
