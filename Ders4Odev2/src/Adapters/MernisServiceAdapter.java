package Adapters;

import java.rmi.RemoteException;
import java.time.LocalDate;
import Abstract.CustomerCheckService;
import Entities.Customer;
import MernisServiceReference.KPSPublicSoap;
import MernisServiceReference.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		KPSPublicSoap client = new KPSPublicSoapProxy();
		 LocalDate date1 = LocalDate.parse(customer.getDateOfBirth().toString());  
		  int year=date1.getYear();
		try {
			boolean sonuc=client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), 
				customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(), year);
			return sonuc;
		} catch (NumberFormatException e) {
		   e.printStackTrace();
		   return false;
		} catch (RemoteException e) {
	       e.printStackTrace();
	       return false;
		}
		
	}
	

}
