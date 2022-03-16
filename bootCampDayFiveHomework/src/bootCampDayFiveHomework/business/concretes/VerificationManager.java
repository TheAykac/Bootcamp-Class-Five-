package bootCampDayFiveHomework.business.concretes;

import java.util.ArrayList;
import java.util.List;

import bootCampDayFiveHomework.business.abstracts.VerificationService;
import bootCampDayFiveHomework.entities.concretes.Customer;


public class VerificationManager implements VerificationService {
	
	
	List<Customer> verification = new ArrayList<Customer>();

	@Override
	public void sendToVerifyMail(Customer customer) {
		verification.add(customer);
		System.out.println(customer.geteMail()+": mail adresini Doðrulama gönderildi");
		
		
		
	}

	@Override
	public void verifyMail(Customer customer) {
		System.out.println("Doðrulandý");
		
	}

	@Override
	public boolean checkVerifyAccount(Customer customer) {
		if(verification.contains(customer)) {
			return true;
		}
		return false;
	}
	
}
