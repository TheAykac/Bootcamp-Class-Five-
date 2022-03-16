package bootCampDayFiveHomework.business.abstracts;

import bootCampDayFiveHomework.entities.concretes.Customer;

public interface CustomerCheckService {
	
	 boolean checkFirstName(Customer customer); 
	boolean checkLastName(Customer customer);
	boolean checkEmail(Customer customer);
	boolean checkPassword(Customer customer);
	
	boolean isThatValid(Customer customer);
	
	

}
