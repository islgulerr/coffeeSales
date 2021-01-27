package coffeeSalesSystem.dataAccess.concretes;

import coffeeSalesSystem.entities.concretes.Campaign;
import coffeeSalesSystem.dataAccess.abstracts.ICampaignDao;

import java.util.ArrayList;

public class StarbucksCampaignDao implements ICampaignDao {
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
		campaigns.add(new Campaign("Hosgeldin Kampanyasi!"));
		campaigns.add(new Campaign("Kahveni Al Yildizi Kazan!"));
		campaigns.add(new Campaign("Toplam 10 Yildiz Toplayana, Bir Kahve Bizden Hediye!"));
		return campaigns;
	}
}
