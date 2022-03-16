package bootCampDayFiveHomework.business.concretes;

import java.util.regex.Pattern;

import bootCampDayFiveHomework.business.abstracts.CustomerCheckService;
import bootCampDayFiveHomework.entities.concretes.Customer;

public class CustomerCheckManager implements CustomerCheckService {


	@Override
	public boolean checkFirstName(Customer customer) {

		if (customer.getFirstName().length() < 2) {
			System.out.println("Ýsminiz 2 karakterden kýsa olmamalýdýr!");
			return false;
		} else if (customer.getFirstName().isBlank()) {
			System.out.println("Ýsim alaný boþ býrakýlamaz!");
			return false;
		}
		return true;
	}

	@Override
	public boolean checkLastName(Customer customer) {
		if (customer.getLastName().length() < 2) {
			System.out.println("Soyadýnýz iki karakterden uzun olmalýdýr.");
			return false;
		} else if (customer.getLastName().isEmpty()) {
			System.out.println("soyad alaný boþ býrakýlmaz");
			return false;
		}
		return true;
	}
	@Override
	public boolean checkEmail(Customer customer) {
		String regex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
		Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

		if (!pattern.matcher(customer.geteMail()).find()) {
			System.out.println("Email Formatýnda giriniz");
			return false;
		}
		return true;

	}

	@Override
	public boolean checkPassword(Customer customer) {
	

		if (customer.getPassword().length() < 7) {

			System.out.println("Paralonýz en az 6 karakter olmalý");
return false;
		}
		return true;
	}

	@Override
	public boolean isThatValid(Customer customer) {

		if (checkEmail(customer) && checkFirstName(customer) && checkLastName(customer) && checkPassword(customer)) {
			
			return true;
		}
		return false;
	}

}
