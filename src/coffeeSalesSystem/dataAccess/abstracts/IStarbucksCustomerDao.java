package coffeeSalesSystem.dataAccess.abstracts;

import coffeeSalesSystem.entities.concretes.StarbucksCompanyCustomers;

import java.util.ArrayList;

public interface IStarbucksCustomerDao {
	void add(StarbucksCompanyCustomers customer);

	void update(StarbucksCompanyCustomers customer);

	void delete(StarbucksCompanyCustomers customer);

	ArrayList<StarbucksCompanyCustomers> getAll();
}
