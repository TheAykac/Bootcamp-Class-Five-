package bootCampDayFiveHomework.business.abstracts;

import bootCampDayFiveHomework.entities.concretes.Customer;

public interface CustomerService {
	
	void register(Customer customer);
	void remove(Customer customer);

}
