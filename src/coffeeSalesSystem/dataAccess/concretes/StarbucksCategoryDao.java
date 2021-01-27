package coffeeSalesSystem.dataAccess.concretes;

import coffeeSalesSystem.entities.concretes.Category;
import coffeeSalesSystem.dataAccess.abstracts.ICategoryDao;

import java.util.ArrayList;

public class StarbucksCategoryDao implements ICategoryDao {
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
		StarbucksProductDao productDAO = new StarbucksProductDao();
		ArrayList<Category> categories = new ArrayList<>();
		categories.add(new Category("Ýcecekler", productDAO.getAllDrinks()));
		categories.add(new Category("Yiyecekler", productDAO.getAllFoods()));
		return categories;
	}
}
