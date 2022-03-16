package bootCampDayFiveHomework.dataAccess.abstracts;

import java.util.List;

import bootCampDayFiveHomework.entities.concretes.Customer;

public interface CustomerDao {

	void add(Customer customer);
    void delete(Customer customer);
    void update(Customer customer);
    Customer get(int id);
    List<Customer> getAll();
}
