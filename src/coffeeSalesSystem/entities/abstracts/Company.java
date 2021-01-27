package coffeeSalesSystem.entities.abstracts;

import java.util.ArrayList;

import coffeeSalesSystem.entities.concretes.Campaign;
import coffeeSalesSystem.entities.concretes.Category;

public abstract class Company {
	ArrayList<Category> categories;
	ArrayList<Campaign> campaigns;

	public Company(ArrayList<Category> categories, ArrayList<Campaign> campaigns) {
		this.categories = categories;
		this.campaigns = campaigns;
	}

	public ArrayList<Category> getCategories() {
		return categories;
	}

	public void setCategories(ArrayList<Category> categories) {
		this.categories = categories;
	}

	public ArrayList<Campaign> getCampaigns() {
		return campaigns;
	}

	public void setCampaigns(ArrayList<Campaign> campaigns) {
		this.campaigns = campaigns;
	}

}
