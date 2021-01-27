package coffeeSalesSystem.entities.concretes;

import java.util.ArrayList;

import coffeeSalesSystem.entities.abstracts.Company;

public class StarbucksCompany extends Company {
	ArrayList<StarbucksCompanyCustomers> starbucksCustomers;

	public StarbucksCompany(ArrayList<Category> categories, ArrayList<Campaign> campaigns,
			ArrayList<StarbucksCompanyCustomers> starbucksCustomers) {
		super(categories, campaigns);
		this.starbucksCustomers = starbucksCustomers;
	}

	public ArrayList<StarbucksCompanyCustomers> getStarbucksCustomers() {
		return starbucksCustomers;
	}

	public void setStarbucksCustomers(ArrayList<StarbucksCompanyCustomers> starbucksCustomers) {
		this.starbucksCustomers = starbucksCustomers;
	}

}
