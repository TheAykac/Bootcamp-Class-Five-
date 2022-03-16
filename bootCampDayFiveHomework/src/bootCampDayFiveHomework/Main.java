package bootCampDayFiveHomework;



import bootCampDayFiveHomework.business.concretes.CustomerCheckManager;
import bootCampDayFiveHomework.business.concretes.CustomerManager;
import bootCampDayFiveHomework.business.concretes.VerificationManager;
import bootCampDayFiveHomework.dataAccess.abstracts.CustomerDao;
import bootCampDayFiveHomework.dataAccess.concretes.HibernateCustomerDao;
import bootCampDayFiveHomework.entities.concretes.Customer;

public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer(1,"ömer","222","farukomeraykac@gmail.com","123456789789");
	
		CustomerManager manager = new CustomerManager(new CustomerCheckManager(),new HibernateCustomerDao(),new VerificationManager() );
		manager.register(customer);
		

	}

}
