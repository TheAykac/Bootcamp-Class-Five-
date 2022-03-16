package bootCampDayFiveHomework.business.concretes;

import bootCampDayFiveHomework.business.abstracts.CustomerCheckService;
import bootCampDayFiveHomework.business.abstracts.CustomerService;
import bootCampDayFiveHomework.business.abstracts.VerificationService;
import bootCampDayFiveHomework.dataAccess.abstracts.CustomerDao;
import bootCampDayFiveHomework.entities.concretes.Customer;



public class CustomerManager implements CustomerService{
	
	private CustomerCheckService customerCheckService;
	private CustomerDao customerDao;
	private VerificationService verificationService;

	public CustomerManager(CustomerCheckService customerCheckService,CustomerDao customerDao,VerificationService verificationService) {
		super();
		this.customerCheckService = customerCheckService;
		this.customerDao=customerDao;
		this.verificationService=verificationService;
	}

	@Override
	public void register(Customer customer) {
		if(customerCheckService.isThatValid(customer)) {
			System.out.println("kullanýcý kaydý oldu: "+customer.getFirstName());
			
		}
		else {
			System.out.println("kullanýcý kaydý olmadý");
			
		}
		
		
	}

	@Override
	public void remove(Customer customer) {
		System.out.println(customer.getFirstName()+": Kullancýsý baþarýyla silindi.");
		
	}
	
	


}
