package bootCampDayFiveHomework.business.abstracts;

import bootCampDayFiveHomework.entities.concretes.Customer;

public interface VerificationService {
	void sendToVerifyMail(Customer customer);
    void verifyMail(Customer customer);
    boolean checkVerifyAccount(Customer customer);

}
