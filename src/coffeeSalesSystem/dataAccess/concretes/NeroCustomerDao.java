package coffeeSalesSystem.dataAccess.concretes;

import coffeeSalesSystem.entities.concretes.NeroCompanyCustomers;
import coffeeSalesSystem.dataAccess.abstracts.INeroCustomerDao;

import java.util.ArrayList;

public class NeroCustomerDao implements INeroCustomerDao {
	@Override
	public void add(NeroCompanyCustomers customer) {
		System.out.println(customer.getName() + " veritabanina eklendi.");
	}

	@Override
	public void update(NeroCompanyCustomers customer) {
		System.out.println(customer.getName() + " veritabani guncellendi.");
	}

	@Override
	public void delete(NeroCompanyCustomers customer) {
		System.out.println(customer.getName() + " veritabanindan silindi.");
	}

	@Override
	public ArrayList<NeroCompanyCustomers> getAll() {
		ArrayList<NeroCompanyCustomers> customers = new ArrayList<>();
		customers.add(new NeroCompanyCustomers("Isil", "Guler", "08.04.1998"));
		customers.add(new NeroCompanyCustomers("Berin", "Guven", "14.03.1988"));
		customers.add(new NeroCompanyCustomers("a", "b", "01.01.2001"));
		return customers;

	}
}
