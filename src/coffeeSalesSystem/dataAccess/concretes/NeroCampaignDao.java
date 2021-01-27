package coffeeSalesSystem.dataAccess.concretes;

import java.util.ArrayList;

import coffeeSalesSystem.dataAccess.abstracts.ICampaignDao;
import coffeeSalesSystem.entities.concretes.Campaign;

public class NeroCampaignDao implements ICampaignDao {
	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " veritabanina eklendi.");

	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " veritabani guncellendi.");

	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " veritabanindan silindi.");

	}

	@Override
	public ArrayList<Campaign> getAll() {
		ArrayList<Campaign> campaigns = new ArrayList<>();
		campaigns.add(new Campaign("IKSV LaleKart"));

		return campaigns;
	}
}
