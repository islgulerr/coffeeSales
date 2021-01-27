package coffeeSalesSystem.dataAccess.concretes;

import java.util.ArrayList;

import coffeeSalesSystem.dataAccess.abstracts.ICategoryDao;
import coffeeSalesSystem.entities.concretes.Category;

public class NeroCategoryDao implements ICategoryDao {
	@Override
	public void add(Category category) {
		System.out.println(category.getCategoryName() + " veritabanina eklendi.");
	}

	@Override
	public void update(Category category) {
		System.out.println(category.getCategoryName() + " veritabaninda guncellendi.");
	}

	@Override
	public void delete(Category category) {
		System.out.println(category.getCategoryName() + " veritabanindan silindi.");
	}

	@Override
	public ArrayList<Category> getAll() {
		NeroProductDao neroProductDAO = new NeroProductDao();
		ArrayList<Category> categories = new ArrayList<>();
		categories.add(new Category("Ýçecekler", neroProductDAO.getAllDrinks()));
		categories.add(new Category("Yiyecekler", neroProductDAO.getAllFoods()));
		return categories;
	}

}
