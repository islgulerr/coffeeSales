package coffeeSalesSystem;

import coffeeSalesSystem.dataAccess.concretes.*;
import coffeeSalesSystem.entities.concretes.NeroCompany;
import coffeeSalesSystem.entities.concretes.StarbucksCompany;
import coffeeSalesSystem.ui.UIHandler;

public class Main {
	static NeroCompany nero;
	static StarbucksCompany starbucks;

	static void init() {
		NeroCategoryDao neroCategoyDao = new NeroCategoryDao();
		NeroCampaignDao neroCampaignDao = new NeroCampaignDao();
		NeroCustomerDao neroCustomerDAO = new NeroCustomerDao();
		nero = new NeroCompany(neroCategoyDao.getAll(), neroCampaignDao.getAll(), neroCustomerDAO.getAll());

		StarbucksCustomerDao starbucksCustomerDAO = new StarbucksCustomerDao();
		StarbucksCategoryDao starbucksCategoryDAO = new StarbucksCategoryDao();
		StarbucksCampaignDao starbucksCampaignDAO = new StarbucksCampaignDao();
		starbucks = new StarbucksCompany(starbucksCategoryDAO.getAll(), starbucksCampaignDAO.getAll(),
				starbucksCustomerDAO.getAll());
	}

	public static void main(String[] args) {
		init();
		new UIHandler(starbucks, nero);
	}
}
