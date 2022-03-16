package bootCampDayFiveHomework.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import bootCampDayFiveHomework.dataAccess.abstracts.CustomerDao;
import bootCampDayFiveHomework.entities.concretes.Customer;

public class HibernateCustomerDao implements CustomerDao{
	List<Customer> customers = new ArrayList<Customer>();

	@Override
	public void add(Customer customer) {
		System.out.println("Kullanýcý eklendi "
                + customer.getFirstName() + " " + customer.getLastName());
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("Kullanýcý silindi! "
                + customer.getFirstName() + " " + customer.getLastName());
		
	}

	@Override
	public void update(Customer customer) {
		 System.out.println("Kullanýcý bilgileri güncellendi "
	                + customer.getFirstName() + " " + customer.getLastName());
		
	}

	@Override
	public Customer get(int id) {
		 return customers.get(id);
	
	}

	@Override
	public List<Customer> getAll() {
		// TODO Auto-generated method stub
		return customers;
	}

}
