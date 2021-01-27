package coffeeSalesSystem.entities.concretes;

import java.util.ArrayList;

import coffeeSalesSystem.entities.abstracts.Company;

public class NeroCompany extends Company {

	ArrayList<NeroCompanyCustomers> neroCustomers;

	public NeroCompany(ArrayList<Category> categories, ArrayList<Campaign> campaigns,
			ArrayList<NeroCompanyCustomers> neroCustomers) {
		super(categories, campaigns);
		this.neroCustomers = neroCustomers;
	}

	public ArrayList<NeroCompanyCustomers> getNeroCustomers() {
		return neroCustomers;
	}

	public void setNeroCustomers(ArrayList<NeroCompanyCustomers> neroCustomers) {
		this.neroCustomers = neroCustomers;
	}
}
