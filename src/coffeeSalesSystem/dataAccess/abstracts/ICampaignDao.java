package coffeeSalesSystem.dataAccess.abstracts;

import coffeeSalesSystem.entities.concretes.Campaign;

import java.util.ArrayList;

public interface ICampaignDao {
	void add(Campaign campaign);

	void update(Campaign product);

	void delete(Campaign product);

	ArrayList<Campaign> getAll();
}
