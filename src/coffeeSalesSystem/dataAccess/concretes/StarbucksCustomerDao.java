package coffeeSalesSystem.dataAccess.concretes;

import coffeeSalesSystem.entities.concretes.StarbucksCompanyCustomers;
import coffeeSalesSystem.dataAccess.abstracts.IStarbucksCustomerDao;

import java.util.ArrayList;

public class StarbucksCustomerDao implements IStarbucksCustomerDao {
	@Override
	public void add(StarbucksCompanyCustomers customer) {
		System.out.println(customer.getName() + " veritabanina eklendi.");
	}

	@Override
	public void update(StarbucksCompanyCustomers customer) {
		System.out.println(customer.getName() + " veritabani guncellendi.");
	}

	@Override
	public void delete(StarbucksCompanyCustomers customer) {
		System.out.println(customer.getName() + " veritabanindan silindi.");
	}

	@Override
	public ArrayList<StarbucksCompanyCustomers> getAll() {
		ArrayList<StarbucksCompanyCustomers> customers = new ArrayList<>();
		customers.add(new StarbucksCompanyCustomers("12345678914", "Engin", "Demirog", "20.12.1990"));
		customers.add(new StarbucksCompanyCustomers("12345678915", "Alya", "Ozbay", "14.03.1997"));
		customers.add(new StarbucksCompanyCustomers("1", "test1", "test2", "01.01.1991"));

		return customers;
	}
}
