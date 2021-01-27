package coffeeSalesSystem.dataAccess.abstracts;

import coffeeSalesSystem.entities.concretes.NeroCompanyCustomers;

import java.util.ArrayList;

public interface INeroCustomerDao {
	void add(NeroCompanyCustomers customer);

	void update(NeroCompanyCustomers customer);

	void delete(NeroCompanyCustomers customer);

	ArrayList<NeroCompanyCustomers> getAll();
}
